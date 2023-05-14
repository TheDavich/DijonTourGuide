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
import com.example.dijontourguide.ui.theme.DijonTourGuideTheme



@Composable
fun ParkScreen(
    parks: List<Dijon>
) {
    LazyColumn(
        modifier = Modifier
        .background(MaterialTheme.colors.background)
            .fillMaxSize()
    ) {
        items(parks) {park ->
            PlaceCard(place = park)
        }
    }
}


@Preview
@Preview("Dark Theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ParkScreenPreview() {
    DijonTourGuideTheme {
        val parks = listOf(
            Dijon(
                icon = R.drawable.restaurant_24px,
                image = R.drawable.jardin_darcy_dijon_avec_son_bassin_et_sa_fontaine_vue_a_rienne_du_216926517,
                description = R.string.jardin_darcy_description,
                title = R.string.jardin_darcy
            ),
            Dijon(
                icon = R.drawable.restaurant_24px,
                image = R.drawable.jardin_darcy_dijon_avec_son_bassin_et_sa_fontaine_vue_a_rienne_du_216926517,
                description = R.string.jardin_darcy_description,
                title = R.string.jardin_darcy
            ),
            Dijon(
                icon = R.drawable.restaurant_24px,
                image = R.drawable.jardin_darcy_dijon_avec_son_bassin_et_sa_fontaine_vue_a_rienne_du_216926517,
                description = R.string.jardin_darcy_description,
                title = R.string.jardin_darcy
            ),
            Dijon(
                icon = R.drawable.restaurant_24px,
                image = R.drawable.jardin_darcy_dijon_avec_son_bassin_et_sa_fontaine_vue_a_rienne_du_216926517,
                description = R.string.jardin_darcy_description,
                title = R.string.jardin_darcy
            ),
            Dijon(
                icon = R.drawable.restaurant_24px,
                image = R.drawable.jardin_darcy_dijon_avec_son_bassin_et_sa_fontaine_vue_a_rienne_du_216926517,
                description = R.string.jardin_darcy_description,
                title = R.string.jardin_darcy
            ),
        )
        ParkScreen(parks = parks)
    }
}