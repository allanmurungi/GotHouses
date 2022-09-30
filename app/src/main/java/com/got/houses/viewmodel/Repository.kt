package com.got.houses.viewmodel

import com.got.houses.models.House
import com.got.houses.services.RetrofitService

class Repository constructor(private val retrofitService: RetrofitService) {

    //get All houses defined function that will be called here
     suspend fun getAllHouses(): NetworkState<List<House>> {
        val response = retrofitService.getAllHouses()
        return if (response.isSuccessful) {
            val responseBody = response.body()
            if (responseBody != null) {
                NetworkState.Success(responseBody)
            } else {
                NetworkState.Error(response)
            }
        } else {
            NetworkState.Error(response)
        }
    }

}