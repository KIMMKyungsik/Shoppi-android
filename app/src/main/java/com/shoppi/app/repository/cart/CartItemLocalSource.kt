package com.shoppi.app.repository.cart

import com.shoppi.app.model.CartItem

class CartItemLocalSource :CartItemDataSource {
    override suspend fun getCartItems(): List<CartItem> {

    }
}