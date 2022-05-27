package com.shoppi.app.repository

import com.shoppi.app.model.Category
import java.util.*

class CategoryRepository(
    private val remoteDataSource: CategoryRemoteDataSource
) {
   suspend fun getCategories(): List<Category>{

        return remoteDataSource.getCategories()
    }
}