package com.got.houses.services

import com.got.houses.models.Book
import com.got.houses.models.House
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {



    @GET("houses/")
    suspend fun getAllHouses(): Response<List<House>>

    @GET("houses/{id}")
    suspend fun getHouse(@Path("id") id: Int): House

    @GET("books/{id}")
    suspend  fun getBooks(@Path("id") id: Int): Response<List<Book>>

    @GET("characters/{id}")
    suspend fun getCharacter(@Path("id") id: Int): Response<List<House>>



    companion object {
        var retrofitService: RetrofitService? = null

        fun getInstance() : RetrofitService {
            if (retrofitService == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://anapioficeandfire.com/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                retrofitService = retrofit.create(RetrofitService::class.java)
            }
            return retrofitService!!
        }

    }
}