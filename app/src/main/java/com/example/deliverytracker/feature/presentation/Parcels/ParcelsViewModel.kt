package com.example.deliverytracker.feature.presentation.Parcels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.deliverytracker.feature.domain.usecase.parcel.ParcelUseCases
import com.example.deliverytracker.feature.domain.util.OrderType
import com.example.deliverytracker.feature.domain.util.ParcelOrder
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ParcelsViewModel @Inject constructor(
    private val parcelUseCases: ParcelUseCases
) : ViewModel() {
    private val _state = mutableStateOf(ParcelState())
    val state: State<ParcelState> get() = _state

    private var getParcelsJob: Job? = null

    init {
        getParcels(ParcelOrder.Date(OrderType.Descending))
    }

    // 정렬을 기반으로 택배 목록 가져오기
    private fun getParcels(parcelOrder: ParcelOrder) {
        getParcelsJob?.cancel() // 이전 코루틴 취소(중복 실행 및 메모리 누수 방지)
        getParcelsJob = parcelUseCases.getParcelsUseCase(parcelOrder)
            .map { parcels ->
                ParcelState(parcels = parcels, parcelOrder = parcelOrder)
            }
            .onEach { newParcelState ->
                _state.value = newParcelState
            }
            .launchIn(viewModelScope)
            // 뷰모델의 수명 주기와 일치시켜 뷰모델이 파괴되는 시점에서 해당 코루틴 취소
            // 메모리 누수 및 예기치 않은 동작 방지
    }
}