package com.example.deliverytracker.feature.data

import com.example.deliverytracker.feature.data.remote.DeliveryRemoteDataSource
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://info.sweettracker.co.kr/"

    private var retrofit: Retrofit? = null

    fun getService(): DeliveryRemoteDataSource {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)// 기본 URL 설정
                .addConverterFactory(GsonConverterFactory.create()) // Json -> Gson
                .build()
        }
        return retrofit!!.create(DeliveryRemoteDataSource::class.java)
    }
}

