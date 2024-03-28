package com.example.deliverytracker.feature.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.deliverytracker.feature.domain.model.Parcel
import kotlinx.coroutines.flow.Flow

@Dao
interface ParcelDao {

    @Query("SELECT * FROM parcel") // 모든 데이터 가져오기
    fun getParcels(): Flow<List<Parcel>>

    @Query("SELECT * FROM parcel WHERE id = :id") // id 값에 맞는 데이터 검색
    suspend fun getParcelById(id: Int): Parcel?

    @Insert(onConflict = OnConflictStrategy.REPLACE) // 데이터 추가
    suspend fun addParcel(parcel: Parcel)

    @Delete
    suspend fun deleteParcel(parcel: Parcel)

}