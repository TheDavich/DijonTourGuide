package com.example.dijontourguide.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.dijontourguide.R

// Set of Material typography styles to start with

val Rubic = FontFamily(
    Font(R.font.rubik_bold, FontWeight.Bold),
    Font(R.font.rubik_regular, FontWeight.Normal)
)

val Typography = Typography(
    defaultFontFamily = Rubic,
    h1 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    ),
    h2 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    h3 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    body1 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)