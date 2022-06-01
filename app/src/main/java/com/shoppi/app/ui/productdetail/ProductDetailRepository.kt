package com.shoppi.app.ui.productdetail


import com.shoppi.app.model.Product
import com.shoppi.app.repository.productdetail.ProductDetailDataSource

class ProductDetailRepository(private val remoteDataSource: ProductDetailDataSource) {

    suspend fun getProductDetail(productId: String): Product {
        return remoteDataSource.getProductDetail(productId)

    }
}