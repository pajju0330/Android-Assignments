package com.example.gmail_clone.model

data class MailData(
    val mailId:Int,
    val username: String,
    val subject: String,
    val body: String,
    val timeStamp: String = ""
)
