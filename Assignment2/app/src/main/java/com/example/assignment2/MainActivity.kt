package com.example.assignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.assignment2.components.HomeBottomMenu
import com.example.assignment2.ui.theme.Assignment2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                       SocialApp()
                    }

                }
            }
        }
    }
}

@Composable
fun SocialApp(){
    val navController = rememberNavController()
    Scaffold (
        bottomBar = {
            HomeBottomMenu(navController = navController)
        }
    ){
        Navigation(navController = navController, paddingValues = it)
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Assignment2Theme {
        Profile()
    }
}