package com.example.deliverytracker.di

import android.app.Application
import androidx.room.Room
import com.example.deliverytracker.feature.data.data_source.ParcelDataBase
import com.example.deliverytracker.feature.data.repository.ParcelRepositoryImpl
import com.example.deliverytracker.feature.domain.repository.ParcelRepository
import com.example.deliverytracker.feature.domain.usecase.parcel.ParcelUseCases
import com.example.note_mvvm_compose.feature.domain.usecase.AddParcelUseCase
import com.example.note_mvvm_compose.feature.domain.usecase.DeleteParcelUseCase
import com.example.note_mvvm_compose.feature.domain.usecase.GetParcelsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideParcelDatabase(app: Application) : ParcelDataBase{
        // 제공된 Application 컨텍스트와 ParcelDB 클래스를 사용해 RoomDB 빌드
        return Room.databaseBuilder(
            app,
            ParcelDataBase::class.java,
            ParcelDataBase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideParcelRepository(db: ParcelDataBase): ParcelRepositoryImpl {
        // ParcelDB 로부터 얻은 ParcelDao를 사용해 ParcelRepositoryImpl 인스턴스화
        return ParcelRepositoryImpl(db.parcelDao)
    }


}