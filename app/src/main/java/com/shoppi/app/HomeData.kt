package com.shoppi.app

import com.google.gson.annotations.SerializedName

data class HomeData(
    val title: Title,
    @SerializedName("top banners") val topBanners : List<Banner>


)
