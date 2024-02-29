package com.example.deliverytracker.feature.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.deliverytracker.feature.domain.model.Parcel


@Database(
    entities = [Parcel::class],
    version = 1
)
abstract class ParcelDataBase : RoomDatabase(){

    abstract val parcelDao : ParcelDao

    companion object{
        const val DATABASE_NAME = "parcel_db"
    }
}