package com.example.deliverytracker.feature.presentation.search

import androidx.lifecycle.ViewModel
import com.example.deliverytracker.feature.domain.usecase.search.SearchTrackingInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    searchUseCase: SearchTrackingInfoUseCase
) : ViewModel() {
}