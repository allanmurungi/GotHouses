package com.got.houses.utils

import com.got.houses.models.House

object ValidationUtil {

    fun validateMovie(house: House) : Boolean {
        if (house.name.isNotEmpty() && house.category.isNotEmpty()) {
            return true
        }
        return false
    }
}