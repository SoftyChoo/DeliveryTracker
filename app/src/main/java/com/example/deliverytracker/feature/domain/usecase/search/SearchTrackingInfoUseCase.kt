package com.example.deliverytracker.feature.domain.usecase.search

import com.example.deliverytracker.feature.domain.repository.SearchRepository

class SearchTrackingInfoUseCase(
    private val repository: SearchRepository
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