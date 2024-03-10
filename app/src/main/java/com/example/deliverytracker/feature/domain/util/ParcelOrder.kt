package com.example.deliverytracker.feature.domain.util

sealed class ParcelOrder(val orderType: OrderType) {
    class Date(orderType: OrderType) : ParcelOrder(orderType)

    class Company(orderType: OrderType) : ParcelOrder(orderType)
}