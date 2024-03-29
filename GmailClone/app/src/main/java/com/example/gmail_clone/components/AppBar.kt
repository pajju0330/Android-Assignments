package com.example.gmail_clone.components

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gmail_clone.GmailApp
import com.example.gmail_clone.ui.theme.GmailCloneTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun AppBar(scaffoldState: ScaffoldState,scope: CoroutineScope ) {
  Box(modifier = Modifier.padding(10.dp)
      ) {
      Card(shape = RoundedCornerShape(10.dp), elevation = 6.dp,
          modifier = Modifier.requiredHeight(50.dp)
        ) {
          Row(
              verticalAlignment = Alignment.CenterVertically,
              modifier = Modifier
                  .fillMaxSize()
                  .padding(8.dp)
          ){
              IconButton(onClick = {
                  scope.launch { scaffoldState.drawerState.open() }
              }) {
                  Icon(Icons.Default.Menu,"Menu", modifier = Modifier.padding(end = 10.dp, start = 5.dp))
              }
              Text(text = "Search in email", modifier = Modifier.weight(2.0f))
              Image(painter = painterResource(id = com.example.gmail_clone.R.drawable.img_20220731_225056_096),
                  contentDescription = "profile",
                  modifier = Modifier
                      .size(30.dp)
                      .clip(CircleShape)
                      .background(color = Color.Gray),
              )
          }
      }
  }
}

@Preview
@Composable
fun DefaultPreview(){
    GmailCloneTheme {
        GmailApp()
    }
}

