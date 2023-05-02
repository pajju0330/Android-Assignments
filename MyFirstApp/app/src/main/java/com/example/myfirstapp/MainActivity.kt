package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val set = findViewById<Button>(R.id.btn1)
        val reset = findViewById<Button>(R.id.btn2)
        val textHead = findViewById<TextView>(R.id.name)
        var timesClicked = 0
        set.setOnClickListener{
            timesClicked+=2
            textHead.text = timesClicked.toString()
//            myBtn.setBackgroundColor('blue')
        }
        reset.setOnClickListener {
            timesClicked = 1
            textHead.text = timesClicked.toString()
            Toast.makeText(this,"Hey Prajwal, you clicking me!!" , Toast.LENGTH_LONG).show()
        }
    }
}