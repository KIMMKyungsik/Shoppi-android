package com.shoppi.app

import com.google.gson.annotations.SerializedName

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

data class Product(
    @SerializedName("brand_name") val brandName: String?,
    val label: String,
    @SerializedName("discount_rate") val discountRate: Int,
    val price: Int,
    @SerializedName("thumbnail_image_url") val thumbnailImageUrl: String?,
    @SerializedName("representative_img_url") val representativeImgUrl:String?,
    @SerializedName("product_id") val productId: String

)
