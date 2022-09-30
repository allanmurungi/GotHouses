package com.got.houses.viewmodel

import com.got.houses.services.RetrofitService

class Repository constructor(private val retrofitService: RetrofitService) {

    suspend fun getAllHouses() = retrofitService.getAllHouses()

}