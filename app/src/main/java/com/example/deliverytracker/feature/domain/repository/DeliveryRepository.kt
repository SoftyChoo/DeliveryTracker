package com.example.deliverytracker.feature.domain.repository

import com.example.deliverytracker.feature.data.model.TrackingInfo
import kotlinx.coroutines.flow.Flow

interface DeliveryRepository {
    fun getTrackingInfo(
        apiKey: String,
        courierCode: String,
        invoiceNumber: String
    ): Flow<TrackingInfo?>
}

