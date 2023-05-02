package com.example.goodtogo.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.goodtogo.GoodToGo
import com.example.goodtogo.R
import com.example.goodtogo.ui.theme.GoodToGoTheme
import com.example.goodtogo.ui.theme.Shapes
import kotlinx.coroutines.CoroutineScope

@Composable
fun Home(){
    Box(modifier = Modifier
        .padding(10.dp)
        .paint(
            painter = painterResource(id = R.drawable.bg_googtogo),
            contentScale = ContentScale.FillBounds
        )
    ){
        Card(shape = RoundedCornerShape(10.dp), elevation = 6.dp,
            modifier = Modifier.requiredHeight(70.dp),
            backgroundColor = Color(0x66FFFFFF),
        ) {
            navbar()
        }
    }
}

@Composable
fun navbar(){
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ){
        Text(text = "Good",
            color = Color(0xFF90EE90),
            fontSize = 30.sp
        )
        Text(text = "To",
            color = Color.White,
            fontSize = 30.sp
        )
        Text(text = "Go",
            modifier = Modifier.weight(1.0f),
            color = Color(0xFF90EE90),
            fontSize = 30.sp,
        )
        Icon(Icons.Default.Menu,"Menu", modifier = Modifier.padding(end = 10.dp, start = 5.dp))
    }
}


@Preview
@Composable
fun DefaultPreview(){
    GoodToGoTheme() {
        GoodToGo()
    }
}

