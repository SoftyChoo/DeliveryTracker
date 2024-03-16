package com.example.deliverytracker.feature.presentation.Parcels

import androidx.lifecycle.ViewModel
import com.example.deliverytracker.feature.domain.usecase.parcel.ParcelUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ParcelsViewModel @Inject constructor(
    private val parcelUseCases: ParcelUseCases
) : ViewModel() {


}