package com.example.deliverytracker.feature.data.repository

import com.example.deliverytracker.feature.data.data_source.ParcelDao
import com.example.deliverytracker.feature.domain.model.Parcel
import com.example.deliverytracker.feature.domain.repository.ParcelRepository
import kotlinx.coroutines.flow.Flow

class ParcelRepositoryImpl(
    private val dao: ParcelDao
) : ParcelRepository {
    override fun getParcel(): Flow<List<Parcel>> = dao.getParcels()

    override suspend fun getParcelById(id: Int): Parcel? = dao.getParcelById(id)

    override suspend fun addParcel(parcel: Parcel) = dao.addParcel(parcel)

    override suspend fun deleteParcel(parcel: Parcel) = dao.deleteParcel(parcel)
}