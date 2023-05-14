package com.example.dijontourguide

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dijontourguide.data.Destination
import com.example.dijontourguide.utils.DijonViewModel

@Composable
fun DijonAppContent() {
    val navController = rememberNavController()
    val viewModel = remember { DijonViewModel() }

    NavHost(navController, startDestination = Destination.CoffeeShopScreen.name) {
        composable(Destination.CoffeeShopScreen.name) {
            DijonTourGuideApp(viewModel = viewModel, navController = navController)
        }
        composable(Destination.KidFriendlyZoneScreen.name) {
            DijonTourGuideApp(viewModel = viewModel, navController = navController)
        }
        composable(Destination.Parks.name) {
            DijonTourGuideApp(viewModel = viewModel, navController = navController)
        }
        composable(Destination.ShoppingCenterScreen.name) {
            DijonTourGuideApp(viewModel = viewModel, navController = navController)
        }
        composable(Destination.RestaurantScreen.name) {
            DijonTourGuideApp(viewModel = viewModel, navController = navController)
        }
        // Add more composable routes for each destination
    }
}