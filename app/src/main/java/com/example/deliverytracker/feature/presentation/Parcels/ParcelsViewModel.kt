package com.example.deliverytracker.feature.presentation.Parcels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.deliverytracker.feature.domain.usecase.parcel.ParcelUseCases
import com.example.deliverytracker.feature.domain.util.OrderType
import com.example.deliverytracker.feature.domain.util.ParcelOrder
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ParcelsViewModel @Inject constructor(
    private val parcelUseCases: ParcelUseCases
) : ViewModel() {
    private val _state = mutableStateOf(ParcelState())
    val state: State<ParcelState> get() = _state


}