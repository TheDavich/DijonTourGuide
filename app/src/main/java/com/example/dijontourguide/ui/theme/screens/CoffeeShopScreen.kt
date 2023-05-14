package com.example.dijontourguide.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.ComposeNavigator
import com.example.dijontourguide.R
import com.example.dijontourguide.data.Dijon
import com.example.dijontourguide.ui.theme.DijonTourGuideTheme
import com.ramcosta.composedestinations.annotation.RootNavGraph

@Composable
fun CoffeeShopScreen(
    coffeeShops: List<Dijon>,
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        items(coffeeShops) {coffeeShop ->
            PlaceCard(place = coffeeShop)
        }
    }
}

@Preview
@Composable
fun CoffeeShopScreenPreview() {
    DijonTourGuideTheme {
        val coffeeShops = listOf(
            Dijon(
                icon = R.drawable.restaurant_24px,
                image = R.drawable.starbucks_dijon_6,
                description = R.string.starbucks_description,
                title = R.string.starbucks
            )
        )
    }
}
