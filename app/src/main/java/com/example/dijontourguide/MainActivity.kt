package com.example.dijontourguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.dijontourguide.data.DijonDataProvider
import com.example.dijontourguide.data.PlaceType
import com.example.dijontourguide.ui.theme.DijonTourGuideTheme
import com.example.dijontourguide.utils.DijonViewModel
import androidx.navigation.compose.rememberNavController
import com.example.dijontourguide.data.Destination

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DijonTourGuideTheme {
                DijonAppContent()
            }
        }
    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DijonTourGuideTheme {

    }
}