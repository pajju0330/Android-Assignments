package com.example.gmail_clone.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gmail_clone.mailList
import com.example.gmail_clone.model.MailData

@Composable
fun MailList(paddingValues: PaddingValues, scrollState: ScrollState){
    Box(modifier = Modifier.padding(paddingValues)) {
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .scrollable(scrollState, orientation = Orientation.Vertical)){
            items(mailList){
                mailData ->
                MailItem(mailData = mailData)
            }
        }
    }
}

@Composable
fun MailItem(mailData: MailData, modifier: Modifier = Modifier){
    Row (){
        Card(modifier = Modifier
            .padding(end = 8.dp)
            .size(40.dp)
            .clip(CircleShape),
            backgroundColor = Color.Gray
        ) {
            Text(text = mailData.username[0].toString(), textAlign = TextAlign.Center,
                modifier = Modifier.padding(8.dp)   

            )
        }
        Column(modifier = Modifier.weight(2.0f).clickable {  }.padding(start = 8.dp)) {
            Text(text = mailData.username,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = mailData.subject,
                fontSize = 14.sp,
            )
            Text(text = mailData.body,
                fontSize = 10.sp,
            )
        }
        Column{
            Text(text = mailData.timeStamp)
            IconButton(
                onClick = {},
                modifier = Modifier
                    .size(50.dp)
                    .padding(top = 16.dp)

            ) {
                Icon(imageVector = Icons.Outlined.Star, contentDescription = "Star ICon")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun MailItemPreview(){
    MailItem(
        mailData = MailData(username = "Prajwal Shah", mailId = 1, subject = "Email regarding internship",
            body = "This is a mail to you regarding your application at our university for internship ",
            timeStamp = "22:02"
        )
    )
}