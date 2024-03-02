package com.example.deliverytracker.feature.domain.repository

import com.example.deliverytracker.feature.domain.model.Parcel
import kotlinx.coroutines.flow.Flow

interface ParcelRepository {
    fun getParcels(): Flow<List<Parcel>>

    suspend fun getParcelById(id: Int): Parcel?

    suspend fun addParcel(parcel: Parcel)

    suspend fun deleteParcel(parcel: Parcel)
}