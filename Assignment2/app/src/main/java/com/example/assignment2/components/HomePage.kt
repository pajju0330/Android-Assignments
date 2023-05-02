package com.example.assignment2.components


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HomePage(){
    Box(modifier = Modifier.padding(top = 150.dp, bottom = 150.dp)) {
        Card (modifier = Modifier.border(2.dp, color = Color.White).fillMaxWidth().fillMaxHeight()){
            Column() {

                Text(text = "Prajwal Shah", color = Color.White, modifier = Modifier.padding(23.dp))
                Text(text = "Prajwal Shah", color = Color.White, modifier = Modifier.padding(23.dp))
                Text(text = "Prajwal Shah", color = Color.White, modifier = Modifier.padding(23.dp))
                Text(text = "Prajwal Shah", color = Color.White, modifier = Modifier.padding(23.dp))

            }
        }

    }

}