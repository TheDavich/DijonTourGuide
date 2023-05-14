package com.example.dijontourguide.ui.theme.screens

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.dijontourguide.data.Dijon
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.tooling.preview.Preview
import com.example.dijontourguide.R
import com.example.dijontourguide.ui.theme.DijonTourGuideTheme



@Composable
fun RestaurantScreen(
    restaurants: List<Dijon>
    ) {
    LazyColumn(
        modifier = Modifier
            .background(MaterialTheme.colors.background)
    ) {
        items(restaurants) { restaurant ->
            PlaceCard(place = restaurant)
        }
    }
}


@Preview
@Preview("Dark Theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun RestaurantPreview() {
    DijonTourGuideTheme {
        val restaurants = listOf(
            Dijon(
                icon = R.drawable.restaurant_24px,
                image = R.drawable.william_frachot,
                description = R.string.william_frachot_description,
                title = R.string.william_frachot
            ),
            Dijon(
                icon = R.drawable.restaurant_24px,
                image = R.drawable.william_frachot,
                description = R.string.william_frachot_description,
                title = R.string.william_frachot
            ),
            Dijon(
                icon = R.drawable.restaurant_24px,
                image = R.drawable.william_frachot,
                description = R.string.william_frachot_description,
                title = R.string.william_frachot
            ),
            Dijon(
                icon = R.drawable.restaurant_24px,
                image = R.drawable.william_frachot,
                description = R.string.william_frachot_description,
                title = R.string.william_frachot
            )
            // Add more restaurants here
        )
        RestaurantScreen(restaurants = restaurants)
    }
}




