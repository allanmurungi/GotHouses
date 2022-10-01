package com.got.houses

import com.got.houses.models.House
import com.got.houses.services.RetrofitService
import com.got.houses.viewmodel.NetworkState
import com.got.houses.viewmodel.Repository
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import retrofit2.Response

@RunWith(JUnit4::class)
class MainRepositoryTest {

    lateinit var mainRepository: Repository

    @Mock
    lateinit var apiService: RetrofitService

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        mainRepository = Repository(apiService)
    }

    @Test
    fun `get all house test`() {
        runBlocking {
            Mockito.`when`(apiService.getAllHouses()).thenReturn(Response.success(listOf<House>()))
            val response = mainRepository.getAllHouses()
            assertEquals(listOf<House>(),  NetworkState.Success(response).data)
        }

    }

}