package com.example.dijontourguide.utils

import com.example.dijontourguide.data.Dijon
import com.example.dijontourguide.data.PlaceType

data class DijonUiState(
    val places: List<Dijon> = emptyList(),
    val placeType: PlaceType? = null
)