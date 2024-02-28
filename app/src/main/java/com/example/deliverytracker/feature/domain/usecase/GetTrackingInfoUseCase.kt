package com.example.deliverytracker.feature.domain.usecase

import com.example.deliverytracker.feature.domain.repository.DeliveryRepository

class GetTrackingInfoUseCase(
    private val repository: DeliveryRepository
) {
    suspend operator fun invoke(
        apiKey: String,
        courierCode: String,
        invoiceNumber: String
    ) {
        repository.getTrackingInfo(
            apiKey,
            courierCode,
            invoiceNumber
        )
    }
}