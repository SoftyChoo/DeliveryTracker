package com.example.deliverytracker.feature.data.model

import java.io.Serializable

data class TrackingDetailResponse(
    var kind: String,
    var telno: String,
    var timeString: String,
    var where: String
) : Serializable