package com.devaman.dailynotes.navigation

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val name: String,
    val route: String,
    val selecteIcon: ImageVector,
    val unselectedIcon: ImageVector,
)
