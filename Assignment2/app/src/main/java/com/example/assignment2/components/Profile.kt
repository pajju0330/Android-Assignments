package com.example.assignment2

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Profile() {
    Card(modifier = Modifier.padding(top= 100.dp,bottom= 100.dp,start= 16.dp,end = 16.dp),
        backgroundColor = Color.DarkGray,
        elevation = 16.dp
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 40.dp)
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_20220731_225056_096),
                contentDescription = "profilepic",
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .border(width = 2.dp, color = Color.Cyan, shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Column() {
                Text(text = "PRAJWAL SHAH", modifier = Modifier.padding(top = 40.dp),
                    style = TextStyle(letterSpacing = 7.sp, fontWeight = FontWeight.Bold))
                Text(text = "STUDENT", modifier = Modifier.padding(top = 10.dp).align(CenterHorizontally),
                    color = Color.LightGray, style = TextStyle(letterSpacing = 2.sp))

            }
            Text(text = "Address: " ,modifier = Modifier.padding(end = 200.dp, top = 40.dp))
            Text(text = "Shahupuri 1st lane Kolhapur. ",color = Color.LightGray, modifier = Modifier.padding(top = 10.dp))


        }
    }
}
