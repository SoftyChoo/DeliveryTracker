package com.example.deliverytracker.feature.domain.usecase.parcel

import com.example.note_mvvm_compose.feature.domain.usecase.AddParcelUseCase
import com.example.note_mvvm_compose.feature.domain.usecase.DeleteParcelUseCase
import com.example.note_mvvm_compose.feature.domain.usecase.GetParcelsUseCase

class ParcelUseCases(
    val getParcelsUseCase: GetParcelsUseCase,
    val addParcelUseCase: AddParcelUseCase,
    val deleteParcelUseCase: DeleteParcelUseCase
)