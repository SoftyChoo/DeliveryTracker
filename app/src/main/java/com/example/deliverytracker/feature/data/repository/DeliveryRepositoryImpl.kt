package com.example.deliverytracker.feature.data.repository

import com.example.deliverytracker.feature.data.model.TrackingInfo
import com.example.deliverytracker.feature.data.remote.DeliveryRemoteDataSource
import com.example.deliverytracker.feature.domain.repository.DeliveryRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DeliveryRepositoryImpl(
    private val deliveryRemoteDataSource: DeliveryRemoteDataSource
) : DeliveryRepository {

    override fun getTrackingInfo(
        apiKey: String,
        courierCode: String,
        invoiceNumber: String
    ): Flow<TrackingInfo?> = flow {
        emit(null) // 초기값

        val call = deliveryRemoteDataSource.getTrackingInfo(apiKey, courierCode, invoiceNumber)
        try {
            val response = call.execute()
            if (response.isSuccessful) { // 성공
                val trackingInfo = response.body() // 정보 가져옴
                emit(trackingInfo) // emit을 사용해 데이터 전달
            } else { // 실패
                emit(null) // null
            }
        } catch (e: Exception) { // 예외
            emit(null) // null
        }
    }
}
