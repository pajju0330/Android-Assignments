package com.example.calculator

import java.util.*

fun calculate(s: String): Int {
    return evaluatePostfix(infixToPostfix(s))
}

private fun rank(op: Char): Int {
    return when {
        op == '+' || op == '-' -> 1
        op == 'x' || op == '/' -> 2
        else -> 0
    }
}

private fun infixToPostfix(infixExp: String): Queue<String> {
    val ans: Queue<String> = LinkedList()
    val stack: Stack<Char> = Stack()
    var i = 0
    val len = infixExp.length
    while (i < len) {
        val num = StringBuilder()
        while (i < len && infixExp[i].isDigit()) num.append(infixExp[i++])
        if (num.isNotEmpty()) ans.add(num.toString())
        if (i == len) break
        val ch = infixExp[i++]
        when {
            ch.isWhitespace() -> {}
            else -> {
                while (stack.isNotEmpty() && rank(stack.peek()) >= rank(ch)) {
                    ans.add("${stack.pop()}")
                }
                stack.push(ch)
            }
        }
    }
    while (stack.isNotEmpty()) {
        ans.add("${stack.pop()}")
    }
    println(ans)
    return ans
}

private fun evaluatePostfix(postfix: Queue<String>): Int {
    val stack: Stack<Long> = Stack()
    for (exp in postfix) {
        if (exp[0].isDigit())
            stack.push(exp.toLong())
        else {
            val b = stack.pop()
            val a = stack.pop()
            when (exp[0]) {
                '+' -> stack.push(a + b)
                '-' -> stack.push(a - b)
                'x' -> stack.push(a * b)
                else -> stack.push(a / b)
            }
        }
    }
    return stack.pop().toInt()
}