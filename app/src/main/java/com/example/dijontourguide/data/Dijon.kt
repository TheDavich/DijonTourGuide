package com.example.dijontourguide.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Dijon(
    @DrawableRes val icon: Int,
    @DrawableRes val image: Int,
    @StringRes val description: Int,
    @StringRes val title: Int,
)