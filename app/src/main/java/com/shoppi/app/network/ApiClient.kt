package com.shoppi.app.network

import com.google.gson.Gson
import com.shoppi.app.model.Category
import okhttp3.OkHttp
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiClient {

    @GET("categories.json")
    suspend fun getCategories():List<Category>

    companion object {
       private const val baseUrl = "https://shoppi-fe2d9-default-rtdb.asia-southeast1.firebasedatabase.app/"


        fun creat(): ApiClient {
            val logger = HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BASIC
            }

            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .build()

            return Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiClient::class.java)


        }
    }

}