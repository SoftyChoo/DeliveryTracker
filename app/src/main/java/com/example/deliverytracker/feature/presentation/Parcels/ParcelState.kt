package com.example.deliverytracker.feature.presentation.Parcels

import com.example.deliverytracker.feature.domain.model.Parcel
import com.example.deliverytracker.feature.domain.util.OrderType
import com.example.deliverytracker.feature.domain.util.ParcelOrder

data class ParcelState(
    val parcels: List<Parcel> = emptyList(),
    val parcelOrder: ParcelOrder = ParcelOrder.Date(OrderType.Descending)
)
