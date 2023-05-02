package com.example.calculator

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.CalculatorTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    val data = remember { mutableStateOf("00") }
    Box(modifier = Modifier
        .fillMaxWidth()
        .border(width = 1.dp, color = Color.White),
    ) {

        Column() {
            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 350.dp, end = 20.dp)
//                .border(width = 1.dp, color = Color.White),
            ) {
                Text(text = "${data.value}", fontWeight = FontWeight.SemiBold, fontSize = 50.sp)
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
//                .border(width = 1.dp, color = Color.White),
            ) {
                CreateButton(text = "+",data)
                CreateButton(text = "-",data)
                CreateButton(text = "x",data)
                CreateButton(text = "/",data)
                Button(
                    onClick = {
                              data.value = "00"
                    },
                    shape = CircleShape,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(60.dp)
                        .padding(start = 0.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)
                ) {
                    Text(text = "C", color = Color.Black, fontWeight = FontWeight.Bold)
                }

            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
//                    .border(width = 1.dp, color = Color.White),
            ) {
                CreateButton(text = "1",data)
                CreateButton(text = "2",data)
                CreateButton(text = "3",data)
                CreateButton(text = "4",data)
                Button(
                    onClick = {
                              if(data.value[0] == '-'){
                                  data.value = data.value.replaceFirst("-","");
                              }else{
                                  data.value = '-' + data.value;
                              }
                    },
                    shape = CircleShape,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(60.dp)
                        .padding(start = 0.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow)
                ) {
                    Text(text = "+/-", color = Color.Black, fontWeight = FontWeight.Bold)
                }
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
//                    .border(width = 1.dp, color = Color.White),
            ) {
                CreateButton(text = "5",data)
                CreateButton(text = "6",data)
                CreateButton(text = "7",data)
                CreateButton(text = "8",data)
                Button(
                    onClick = {
                    },
                    shape = CircleShape,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(60.dp)
                        .padding(start = 0.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow)
                ) {
                    Text(text = "()", color = Color.Black, fontWeight = FontWeight.Bold)
                }
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
//                    .border(width = 1.dp, color = Color.White),
            ) {
                CreateButton(text = ".",data)
                CreateButton(text = "9",data)
                CreateButton(text = "0",data)
                CreateButton(text = "%",data)
                Button(
                    onClick = {
                        val x = calculate(data.value);
                        println(x)
                        data.value = x.toString()
                    },
                    shape = CircleShape,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(60.dp)
                        .padding(start = 0.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green)
                ) {
                    Text(text = "=", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 30.sp)
                }
            }
        }
    }
}

@Composable
fun CreateButton(text: String,data: MutableState<String>){
    Column(horizontalAlignment = Alignment.CenterHorizontally,) {

        val orange = Color(0xffff781f)
        Button(
            onClick = {
                if(data.value.endsWith("+") && text == "+"){
                    data.value = "INVALID FORMAT"
                }
                else if(data.value == "00"){
                    data.value = text
                }else{
                    data.value += text
                }
            },
            shape = CircleShape,
            modifier = Modifier
                .clip(CircleShape)
                .size(60.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = orange)
            ) {
            Text(text = text, color = Color.Black, fontWeight = FontWeight.SemiBold, fontSize = 30.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CalculatorTheme {
        Greeting()
    }
}