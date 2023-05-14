package com.example.dijontourguide.data

import com.example.dijontourguide.R

class DijonDataProvider {
    fun getPlaces(placeType: PlaceType): List<Dijon> {
        // Implement the logic to fetch places based on placeType
        // Return a list of Dijon objects representing the places
        return when (placeType) {
            PlaceType.Restaurants -> listOf(
                Dijon(
                    icon = R.drawable.restaurant_24px,
                    image = R.drawable.peter_herrmann_cvqdh5rlytc_unsplash,
                    description = R.string.delirium_description,
                    title = R.string.delirium_bar
                )
            )
            PlaceType.CoffeeShops -> listOf(
                Dijon(
                    icon = R.drawable.restaurant_24px,
                    image = R.drawable.starbucks_dijon_6,
                    description = R.string.starbucks_description,
                    title = R.string.starbucks
                ),
                // Add more coffee shop places
            )
            PlaceType.KidFriendlyPlaces -> listOf(
                Dijon(
                    icon = R.drawable.restaurant_24px,
                    image = R.drawable.planetarium,
                    description = R.string.planetarium_description,
                    title = R.string.planetarium
                )
            )
            PlaceType.Parks -> listOf(
                Dijon(
                    icon = R.drawable.restaurant_24px,
                    image = R.drawable.jardin_darcy_dijon_avec_son_bassin_et_sa_fontaine_vue_a_rienne_du_216926517,
                    description = R.string.jardin_darcy_description,
                    title = R.string.jardin_darcy
                ),
                // Add more park places
            )
            PlaceType.ShoppingCenters -> listOf(
                Dijon(
                    icon = R.drawable.restaurant_24px,
                    image = R.drawable.toison_dor,
                    description = R.string.delirium_description,
                    title = R.string.delirium_bar
                )
            )
        }
    }
}
