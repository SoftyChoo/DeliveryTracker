package com.example.deliverytracker.feature.presentation.util

sealed class Screen(val route:String){
    object ParcelScreen :Screen(route = "parcels_screen")
    object SearchScreen :Screen(route = "search_screen")
}
