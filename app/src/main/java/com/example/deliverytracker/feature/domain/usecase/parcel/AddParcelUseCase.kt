package com.example.note_mvvm_compose.feature.domain.usecase

import com.example.deliverytracker.feature.domain.model.ParcelEntity
import com.example.deliverytracker.feature.domain.repository.ParcelRepository

class AddParcelUseCase(
    private val repository: ParcelRepository
) {
    suspend operator fun invoke(parcel: ParcelEntity) {
        repository.addParcel(parcel)
    }
}