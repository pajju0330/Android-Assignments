package com.example.assignment2

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.assignment2.components.HomePage
import com.example.assignment2.models.Screen

@Composable
fun Navigation(navController: NavHostController, paddingValues: PaddingValues){
    NavHost(navController = navController, startDestination = Screen.HomePage.route){
        composable(route = Screen.Profile.route){
            println("hello")
            Profile()
        }
        composable(route = Screen.HomePage.route){
            HomePage()
        }
    }
}