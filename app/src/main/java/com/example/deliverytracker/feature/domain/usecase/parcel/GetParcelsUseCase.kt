package com.example.note_mvvm_compose.feature.domain.usecase

import com.example.deliverytracker.feature.domain.model.Parcel
import com.example.deliverytracker.feature.domain.repository.ParcelRepository
import kotlinx.coroutines.flow.Flow

class GetParcelsUseCase(
    private val repository: ParcelRepository
) {
    operator fun invoke(parcel: Parcel) : Flow<List<Parcel>>{
        return repository.getParcels()
    }

}