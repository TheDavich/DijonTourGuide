package com.example.dijontourguide.ui.theme.screens

import android.content.res.Configuration
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dijontourguide.R
import com.example.dijontourguide.data.Destination
import com.example.dijontourguide.data.Dijon
import com.example.dijontourguide.ui.theme.DijonTourGuideTheme
import com.example.dijontourguide.utils.DijonViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.dijontourguide.DijonTourGuideApp
import com.example.dijontourguide.data.DijonDataProvider
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Composable
fun PlaceCard(
    place: Dijon,
    modifier: Modifier = Modifier.padding(16.dp)
) {
    Card(
        modifier = modifier,
        backgroundColor = MaterialTheme.colors.surface
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            PlaceImage(place = place)
            PlaceText(place = place)
        }
    }
}
@Composable
fun PlaceImage(
    modifier: Modifier = Modifier,
    place: Dijon
) {
    Image(
        painter = painterResource(place.image),
        contentDescription = null,
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .fillMaxWidth()
            .height(200.dp),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun PlaceText(
    modifier: Modifier = Modifier,
    place: Dijon
) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(id = place.title),
            color = MaterialTheme.colors.onSurface,
            modifier = Modifier.padding(start = 16.dp, top = 16.dp),
            style = MaterialTheme.typography.h1
        )

        Text(
            text = stringResource(id = place.description),
            color = MaterialTheme.colors.onSurface,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 10.dp),
            style = MaterialTheme.typography.h2
        )
    }
}

@Composable
fun BottomNavigationBar(
    viewModel: DijonViewModel,
    navController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.background)
            .clip(RoundedCornerShape(16.dp))
    ) {
        BottomNavigationChips(
            viewModel = viewModel,
            navController = navController
        )
    }
}


@Composable
fun BottomNavigationChips(
    modifier: Modifier = Modifier,
    viewModel: DijonViewModel,
    navController: NavHostController
) {
    val selectedDestination by viewModel.destination.collectAsState()

    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(
                MaterialTheme.colors.onPrimary
            )
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.coffee_40px),
            contentDescription = "Coffee Shop",
            colorFilter = getDestinationColorFilter(Destination.CoffeeShopScreen, selectedDestination),
            modifier = Modifier
                .clickable {
                    if (selectedDestination != Destination.CoffeeShopScreen) {
                        viewModel.navigateTo(Destination.CoffeeShopScreen)
                        navController.navigate(Destination.CoffeeShopScreen.name)
                    }
                }
        )
        Image(
            painter = painterResource(id = R.drawable.restaurant_40px),
            contentDescription = "Restaurant",
            colorFilter = getDestinationColorFilter(Destination.RestaurantScreen, selectedDestination),
            modifier = Modifier
                .clickable {
                    if (selectedDestination != Destination.RestaurantScreen) {
                        viewModel.navigateTo(Destination.RestaurantScreen)
                        navController.navigate(Destination.RestaurantScreen.name)
                    }
                }
        )
        Image(
            painter = painterResource(id = R.drawable.child_care_40px),
            contentDescription = "Kid friendly zones",
            colorFilter = getDestinationColorFilter(Destination.KidFriendlyZoneScreen, selectedDestination),
            modifier = Modifier
                .clickable {
                    if (selectedDestination != Destination.KidFriendlyZoneScreen) {
                        viewModel.navigateTo(Destination.KidFriendlyZoneScreen)
                        navController.navigate(Destination.KidFriendlyZoneScreen.name)
                    }
                }
        )
        Image(
            painter = painterResource(id = R.drawable.local_mall_40px),
            contentDescription = "Shopping Centers",
            colorFilter = getDestinationColorFilter(Destination.ShoppingCenterScreen, selectedDestination),
            modifier = Modifier
                .clickable {
                    if (selectedDestination != Destination.ShoppingCenterScreen) {
                        viewModel.navigateTo(Destination.ShoppingCenterScreen)
                        navController.navigate(Destination.ShoppingCenterScreen.name)
                    }
                }
        )
        Image(
            painter = painterResource(id = R.drawable.park_40px),
            contentDescription = "Parks",
            colorFilter = getDestinationColorFilter(Destination.Parks, selectedDestination),
            modifier = Modifier
                .clickable {
                    if (selectedDestination != Destination.Parks) {
                        viewModel.navigateTo(Destination.Parks)
                        navController.navigate(Destination.Parks.name)
                    }
                }
        )
    }
}

@Composable
fun getDestinationColorFilter(destination: Destination, selectedDestination: Destination): ColorFilter {
    val selectedColor = MaterialTheme.colors.secondary
    val unselectedColor = MaterialTheme.colors.onBackground
    val color = if (destination == selectedDestination) selectedColor else unselectedColor
    return ColorFilter.tint(color)
}


@Preview
@Preview("Dark Theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun CardPreview() {
    DijonTourGuideTheme {

    }
}


@Preview(showBackground = false)
@Composable
fun BottomNavigationPreview() {
    DijonTourGuideTheme {
    }
}
