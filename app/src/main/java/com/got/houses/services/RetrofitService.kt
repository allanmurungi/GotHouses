package com.got.houses.services

import com.got.houses.models.Book
import com.got.houses.models.House
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {

//
    @GET("houses")
    fun getAllHouses(): List<House>

    @GET("houses/{id}")
    fun getHouse(@Path("id") id: Int): House

    @GET("books/{id}")
    fun getBooks(@Path("id") id: Int): List<Book>

    @GET("characters/{id}")
    fun getCharacter(@Path("id") id: Int): List<House>


}