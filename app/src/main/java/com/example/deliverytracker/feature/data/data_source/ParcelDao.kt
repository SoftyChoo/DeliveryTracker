package com.example.deliverytracker.feature.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.deliverytracker.feature.domain.model.ParcelEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ParcelDao {

    @Query("SELECT * FROM parcel") // 모든 데이터 가져오기
    fun getParcels(): Flow<List<ParcelEntity>>

    @Query("SELECT * FROM parcel WHERE id = :id") // id 값에 맞는 데이터 검색
    suspend fun getParcelById(id: Int): ParcelEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE) // 데이터 추가
    suspend fun addParcel(parcel: ParcelEntity)

    @Delete
    suspend fun deleteParcel(parcel: ParcelEntity)

}