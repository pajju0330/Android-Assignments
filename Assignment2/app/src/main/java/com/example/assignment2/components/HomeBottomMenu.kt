package com.example.assignment2.components

import androidx.compose.foundation.border
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.assignment2.models.BottomMenuData


@Composable
fun HomeBottomMenu(navController: NavHostController){
    val items = listOf(BottomMenuData.Return,BottomMenuData.Profile)
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    BottomNavigation(backgroundColor = Color.Black, contentColor = Color.White) {
        items.forEach{
            BottomNavigationItem(
                modifier = Modifier.border(width = 1.dp, color = Color.DarkGray ),
                label = { Text(text = it.title)},
                selected = currentRoute == it.route,
                onClick = {
                          navController.navigate(it.route)
                },
                icon = {
                    Icon(imageVector = it.icon, contentDescription = it.title)
                       },
                alwaysShowLabel = false
            )

        }
    }
}