package com.example.deliverytracker.feature.data.remote

import com.example.deliverytracker.feature.data.model.TrackingInfoResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchRemoteDataSource {
    @GET("/api/v1/trackingInfo")
    fun getTrackingInfo(
        @Query("t_key") apiKey: String,
        @Query("t_code") courierCode: String, // 택배사 코드
        @Query("t_invoice") invoiceNumber: String // 운송장 번호
    ): Call<TrackingInfoResponse>
}

