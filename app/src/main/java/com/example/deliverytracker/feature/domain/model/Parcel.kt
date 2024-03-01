package com.example.deliverytracker.feature.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.deliverytracker.feature.data.model.TrackingDetail
import com.example.deliverytracker.feature.data.model.TrackingInfo

@Entity
data class Parcel(
//    val trackingInfo: TrackingInfo,
    @PrimaryKey val id: Int? = null,
    val adUrl: String,
    val complete: Boolean,
    val completeYN: String,
    val estimate: String,
    val level: Int,
    val trackingDetails: List<TrackingDetail>,
    val invoiceNo: String,
    val itemImage: String,
    val itemName: String,
    val orderNumber: String,
    val productInfo: String,
    val receiverAddr: String,
    val receiverName: String,
    val recipient: String,
    val result: String,
    val senderName: String
)


