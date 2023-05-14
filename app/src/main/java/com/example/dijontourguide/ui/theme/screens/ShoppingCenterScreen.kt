package com.example.dijontourguide.ui.theme.screens

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
import com.example.dijontourguide.ui.theme.DijonTourGuideTheme
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Composable
fun ShoppingCenterScreen(
    shoppingCenters: List<Dijon>
    ) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        items(shoppingCenters) {shoppingCenter ->
            PlaceCard(place = shoppingCenter)
        }
    }
}

@Preview
@Composable
fun ShoppingCenterScreenPreview() {
    DijonTourGuideTheme {
        val shoppingCenters = listOf(
            Dijon(
                icon = R.drawable.restaurant_24px,
                image = R.drawable.toison_dor,
                description = R.string.toison_dor_description,
                title = R.string.toison_dor
            )
        )
        ShoppingCenterScreen(shoppingCenters = shoppingCenters)
    }
}