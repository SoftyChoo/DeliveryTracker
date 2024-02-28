package com.example.deliverytracker.feature.data.model

import com.google.gson.annotations.SerializedName

data class TrackingInfo(
    @SerializedName("adUrl") val adUrl: String,
    @SerializedName("complete") val complete: Boolean,
    @SerializedName("completeYN") val completeYN: String,
    @SerializedName("estimate") val estimate: String,
    @SerializedName("level") val level: Int,
    @SerializedName("trackingDetails") val trackingDetails: List<TrackingDetail>,
    @SerializedName("invoiceNo") val invoiceNo: String,
    @SerializedName("itemImage") val itemImage: String,
    @SerializedName("itemName") val itemName: String,
    @SerializedName("orderNumber") val orderNumber: String,
    @SerializedName("productInfo") val productInfo: String,
    @SerializedName("receiverAddr") val receiverAddr: String,
    @SerializedName("receiverName") val receiverName: String,
    @SerializedName("recipient") val recipient: String,
    @SerializedName("result") val result: String,
    @SerializedName("senderName") val senderName: String
)