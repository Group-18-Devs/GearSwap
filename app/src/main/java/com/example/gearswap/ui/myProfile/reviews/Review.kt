package com.example.gearswap.ui.myProfile.reviews

data class Review( val customerName: String,
                   val rating: Float,
                   val reviewText: String,
                   val profilePictureUrl: String? = null)
