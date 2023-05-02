package com.example.gmail_clone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gmail_clone.model.DrawerMenuData

@Composable
fun GmailDrawer(){

    val menuList = listOf(
        DrawerMenuData.AllInboxes,
        DrawerMenuData.Primary,
        DrawerMenuData.Social,
        DrawerMenuData.Divider
    )
    Column() {
        Text(text = "Gmail", color = Color.Red,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),
            fontSize = 20.sp ,
            fontWeight = FontWeight.Bold
        )
        menuList.forEach{
            item->
            when {
                item.isDivider -> {
                    Divider(modifier = Modifier.padding(bottom = 20.dp, top = 20.dp))
                }
                else -> {
                    MailDrawerItem(item = item)
                }
            }
        }
    }

}

@Composable
fun MailDrawerItem(item: DrawerMenuData){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(top = 16.dp)
    ){
        Image(imageVector = item.icon!!, contentDescription = item.title!!,
            modifier = Modifier.weight(0.5f)
        )
        Text(text = item.title, modifier = Modifier.weight(2.0f))
    }
}