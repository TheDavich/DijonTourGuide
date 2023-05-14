package com.example.dijontourguide.ui.theme.screens

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dijontourguide.R
import com.example.dijontourguide.data.Dijon
import com.example.dijontourguide.data.DijonDataProvider
import com.example.dijontourguide.ui.theme.DijonTourGuideTheme



@Composable
fun KidFriendlyZoneScreen(
    kidFriendlyPlaces: List<Dijon>
) {
    LazyColumn(
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .fillMaxSize()
    ) {
        items(kidFriendlyPlaces) {kidFriendlyPlace ->
            PlaceCard(place = kidFriendlyPlace)
        }
    }
}


@Preview
@Preview("Dark Theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun KidFriendlyZonePreview() {
    DijonTourGuideTheme {
        val zones = listOf(
            Dijon(
                icon = R.drawable.restaurant_24px,
                image = R.drawable.planetarium,
                description = R.string.planetarium_description,
                title = R.string.planetarium
            )
        )
        KidFriendlyZoneScreen(kidFriendlyPlaces = zones)
    }
}