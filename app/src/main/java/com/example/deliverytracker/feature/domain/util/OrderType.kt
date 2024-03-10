package com.example.deliverytracker.feature.domain.util

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}
