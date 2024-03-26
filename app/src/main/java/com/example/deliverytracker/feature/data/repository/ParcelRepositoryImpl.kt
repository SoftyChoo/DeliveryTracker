package com.example.deliverytracker.feature.data.repository

import com.example.deliverytracker.feature.data.data_source.ParcelDao
import com.example.deliverytracker.feature.domain.model.ParcelEntity
import com.example.deliverytracker.feature.domain.repository.ParcelRepository
import kotlinx.coroutines.flow.Flow

class ParcelRepositoryImpl(
    private val dao: ParcelDao
) : ParcelRepository {
    override fun getParcels(): Flow<List<ParcelEntity>> = dao.getParcels()

    override suspend fun getParcelById(id: Int): ParcelEntity? = dao.getParcelById(id)

    override suspend fun addParcel(parcel: ParcelEntity) = dao.addParcel(parcel)

    override suspend fun deleteParcel(parcel: ParcelEntity) = dao.deleteParcel(parcel)
}