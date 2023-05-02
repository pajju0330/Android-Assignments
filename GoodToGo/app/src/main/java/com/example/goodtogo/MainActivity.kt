package com.example.goodtogo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.goodtogo.components.Home
import com.example.goodtogo.ui.theme.GoodToGoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoodToGoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GoodToGo()
                }
            }
        }
    }
}

@Composable
fun GoodToGo() {
    Home()

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GoodToGoTheme {
        GoodToGo()
    }
}