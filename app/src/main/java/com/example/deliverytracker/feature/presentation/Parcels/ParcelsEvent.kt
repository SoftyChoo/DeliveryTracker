package com.example.deliverytracker.feature.presentation.Parcels

import com.example.deliverytracker.feature.domain.model.Parcel
import com.example.deliverytracker.feature.domain.util.ParcelOrder

sealed class ParcelsEvent {
    data class Order(val parcelOrder: ParcelOrder) : ParcelsEvent()
    data class DeleteParcel(val parcel: Parcel) : ParcelsEvent()
}
