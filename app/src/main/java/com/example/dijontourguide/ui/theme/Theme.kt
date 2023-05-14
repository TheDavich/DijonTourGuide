package com.example.dijontourguide.ui.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


private val DarkColorPalette = darkColors(
    background = backgroundDark,
    surface = onBackgroundDark,
    onSurface = textWhite,
    secondary = pressedButtonRed,
    onBackground = buttonDark,
    onPrimary = navigationBarColorDark
)

private val LightColorPalette = lightColors(
    background = backgroundLight,
    surface = onBackgroundLight,
    onSurface = textGray,
    secondary = pressedButtonRed,
    onBackground = buttonLight,
    onPrimary = navigationBarColorLight

)

@Composable
fun DijonTourGuideTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}


