package com.example.assignment2.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomMenuData(
    val icon: ImageVector,
    val title: String,
    val route: String,
) {
    object Return : BottomMenuData(icon = Icons.Outlined.ArrowBack, title = "return", route = "HomePage")
    object Profile : BottomMenuData(icon = Icons.Outlined.Person, title = "Profile", route = "Profile")
}