package com.example.deliverytracker.feature.domain.repository

import com.example.deliverytracker.feature.domain.model.ParcelEntity
import kotlinx.coroutines.flow.Flow

interface ParcelRepository {
    fun getParcels(): Flow<List<ParcelEntity>>

    suspend fun getParcelById(id: Int): ParcelEntity?

    suspend fun addParcel(parcel: ParcelEntity)

    suspend fun deleteParcel(parcel: ParcelEntity)
}