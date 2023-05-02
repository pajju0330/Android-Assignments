package com.example.gmail_clone.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.gmail_clone.model.BottomMenuData

@Composable
fun HomeBottomMenu(){
    val items = listOf(BottomMenuData.Mail,BottomMenuData.Meet)
    BottomNavigation(backgroundColor = Color.Black, contentColor = Color.White) {
        items.forEach{
            BottomNavigationItem(
                label = { Text(text = it.title)},
                alwaysShowLabel = true,
                selected = false,
                onClick = { /*TODO*/ },
                icon = {Icon(imageVector = it.icon, contentDescription = it.title)})
        }
    }
}