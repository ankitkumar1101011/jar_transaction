package com.example.project2.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

//icons used in topbar
@Composable
fun icon(icon: Int,
         modifier: Modifier = Modifier
) {
    Column (modifier){
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(Color(0xFF2B173D), Color(0xFF4F3964)),
                        center = Offset(130f, 120f),
                        radius = 140f,
                    ),
                    shape = CircleShape
                )
                .padding(10.dp)
        ) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = "Profile Icon",
                tint = Color.White,
                modifier = Modifier
                    .fillMaxSize()
//                .padding(12.dp)// padding of image
            )
        }
    }

}