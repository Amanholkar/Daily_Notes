package com.devaman.dailynotes.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.devaman.dailynotes.components.BackPressHandler

@Composable
fun HomeScreen() {
    BackPressHandler()
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {

    }

}