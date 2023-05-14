package com.example.dijontourguide.utils

import androidx.lifecycle.ViewModel
import com.example.dijontourguide.R
import com.example.dijontourguide.data.Destination
import com.example.dijontourguide.data.Dijon
import com.example.dijontourguide.data.DijonDataProvider
import com.example.dijontourguide.data.PlaceType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

// view model for DijonTourGuideApp

class DijonViewModel : ViewModel() {
    private val dataProvider: DijonDataProvider = DijonDataProvider()

    // UI state exposed to the UI
    private val _uiState = MutableStateFlow(DijonUiState())
    val uiState: StateFlow<DijonUiState> = _uiState

    // Navigation state
    private val _destination = MutableStateFlow<Destination>(Destination.CoffeeShopScreen)
    val destination: StateFlow<Destination> = _destination.asStateFlow()

    init {
        loadData(PlaceType.CoffeeShops)
    }

    fun loadData(placeType: PlaceType) {
        val places = dataProvider.getPlaces(placeType)
        _uiState.value = DijonUiState(places, placeType)
    }

    fun navigateTo(destination: Destination) {
        _destination.value = destination
        // Load the data for the selected destination
        when (destination) {
            Destination.CoffeeShopScreen -> loadData(PlaceType.CoffeeShops)
            Destination.KidFriendlyZoneScreen -> loadData(PlaceType.KidFriendlyPlaces)
            Destination.Parks -> loadData(PlaceType.Parks)
            Destination.ShoppingCenterScreen -> loadData(PlaceType.ShoppingCenters)
            Destination.RestaurantScreen -> loadData(PlaceType.Restaurants)
            // Add more cases for each destination
        }
    }
}







