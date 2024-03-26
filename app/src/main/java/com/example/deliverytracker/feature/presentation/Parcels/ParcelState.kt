package com.example.deliverytracker.feature.presentation.Parcels

import com.example.deliverytracker.feature.domain.model.ParcelEntity
import com.example.deliverytracker.feature.domain.util.OrderType
import com.example.deliverytracker.feature.domain.util.ParcelOrder

data class ParcelState(
    val parcels: List<ParcelEntity> = emptyList(),
    val parcelOrder: ParcelOrder = ParcelOrder.Date(OrderType.Descending)
)
