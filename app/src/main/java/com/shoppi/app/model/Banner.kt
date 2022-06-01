package com.shoppi.app

import com.google.gson.annotations.SerializedName
import com.shoppi.app.model.Product

data class Banner(
    @SerializedName("background_image_url") val backgroundImageUrl: String,
    val badge: BannerBadge,
    val label: String,
    @SerializedName("product_detail") val productDetail: Product


)

data class BannerBadge(

    val label: String,
    @SerializedName("backgroundcolor") val backGroundColor: String
)


