package com.example.assignment1

import android.os.Bundle

import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment1.ui.theme.Assignment1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Box(
                        modifier = Modifier
                            .width(50.dp)
                            .padding(start = 40.dp, top = 200.dp)
                    ) {
                        FirstTask()

                    }
                    Toast.makeText(this,"Assignment 1",Toast.LENGTH_LONG).show()

                }
            }
        }
    }
}

@Composable
fun ShowData(name:String){
    Text(text = "Hello $name",
        modifier = Modifier.padding(top = 120.dp, start = 45.dp),
        fontSize = 30.sp,
        color = Color.Cyan
    )

}
@Composable
fun FirstTask() {
    val name = remember { mutableStateOf("") }
    val flag = remember { mutableStateOf(false) }
    OutlinedTextField(value = name.value, onValueChange = { newValue -> name.value = newValue},
        label = { Text(text = "Name: ") },
        placeholder = { Text(text = "Your Name")}
    )
    Button(modifier = Modifier.padding(start = 95.dp, top = 70.dp),onClick = {
        flag.value = true
    }) {
        Text(text = "Submit")
    }
    if(flag.value){
        ShowData(name.value)
    }



}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstTask()
}