package com.example.assignment2.models

sealed class Screen (val route: String){
    object Profile : Screen("Profile")
    object HomePage : Screen("HomePage")
}