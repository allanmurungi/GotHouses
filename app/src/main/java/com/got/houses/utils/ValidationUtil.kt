package com.got.houses.utils

import com.got.houses.models.House

object ValidationUtil {
//a utility to help validate data

    fun validateHouse(house: House) : Boolean {
        if (house.name?.isNotEmpty() ?: true && house.region?.isNotEmpty() ?: true) {
            return true
        }
        return false
    }
}