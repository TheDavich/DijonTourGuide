package com.example.dijontourguide

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dijontourguide.data.Destination
import com.example.dijontourguide.ui.theme.screens.BottomNavigationBar
import com.example.dijontourguide.ui.theme.screens.PlaceCard
import com.example.dijontourguide.utils.DijonViewModel
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DijonTourGuideApp(
    viewModel: DijonViewModel,
    navController: NavHostController
) {
    val uiState by viewModel.uiState.collectAsState()

    Scaffold(
        bottomBar = { BottomNavigationBar(viewModel = viewModel, navController = navController) }
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            LazyColumn(
                modifier = Modifier
                    .weight(1f)
                    .background(MaterialTheme.colors.background)
            ) {
                items(uiState.places) { place ->
                    PlaceCard(place = place)
                }
            }
        }
    }
}
