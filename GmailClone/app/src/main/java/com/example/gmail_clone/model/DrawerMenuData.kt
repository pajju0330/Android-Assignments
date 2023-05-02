package com.example.gmail_clone.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AllInbox
import androidx.compose.material.icons.outlined.Inbox
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData(
    val icon: ImageVector? = null,
    val title: String? = null,
    val isDivider: Boolean = false,
    val isHeader: Boolean =  false) {
    object AllInboxes: DrawerMenuData(icon =  Icons.Outlined.AllInbox, title = "All Inboxes")
    object Primary: DrawerMenuData(icon =  Icons.Outlined.Inbox, title = "Primary")
    object Social: DrawerMenuData(icon =  Icons.Outlined.Person, title = "Social")
    object Divider: DrawerMenuData(isDivider = true)
}
