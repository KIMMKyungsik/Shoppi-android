package com.shoppi.app.repository.cart

import com.shoppi.app.model.CartItem

interface CartItemDataSource {

   suspend fun getCartItems():List<CartItem>



}