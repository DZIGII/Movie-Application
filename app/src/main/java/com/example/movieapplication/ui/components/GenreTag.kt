package com.example.movieapplication.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movieapplication.model.Genre

@Composable
fun GenreTag(
    genre: Genre
) {
    Box(
        modifier = Modifier
            .background(
                color = Color(0xFF333333),
                shape = RoundedCornerShape(10.dp)
            )
            .padding(horizontal = 8.dp, vertical = 2.dp)
    ) {
        Text(
            text = genre.genre,
            fontSize = 13.sp,
            color = Color(0xFFCCCCCC)
        )
    }
}