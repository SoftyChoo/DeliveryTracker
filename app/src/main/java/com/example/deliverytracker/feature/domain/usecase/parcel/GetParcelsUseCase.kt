package com.example.note_mvvm_compose.feature.domain.usecase

import com.example.deliverytracker.feature.domain.model.Parcel
import com.example.deliverytracker.feature.domain.repository.ParcelRepository
import com.example.deliverytracker.feature.domain.util.OrderType
import com.example.deliverytracker.feature.domain.util.ParcelOrder
import kotlinx.coroutines.flow.Flow

class GetParcelsUseCase(
    private val repository: ParcelRepository
) {
    operator fun invoke(
        parcelOrder: ParcelOrder = ParcelOrder.Date(OrderType.Descending)// 디폴트 : 내림차순
    ) : Flow<List<Parcel>>{
        return repository.getParcels()
    }

}