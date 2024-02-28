package com.example.deliverytracker.feature.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.deliverytracker.feature.data.model.TrackingInfo

@Entity
data class Parcel(
    val trackingInfo: TrackingInfo,
    @PrimaryKey val id: Int? = null
)


