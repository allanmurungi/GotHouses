package com.got.houses

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.got.houses.models.House
import com.got.houses.services.RetrofitService
import com.got.houses.viewmodel.MyViewModel
import com.got.houses.viewmodel.NetworkState
import com.got.houses.viewmodel.Repository
import com.velmurugan.mvvmwithkotlincoroutinesandretrofit.getOrAwaitValue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.setMain
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations
import retrofit2.Response

@ExperimentalCoroutinesApi
@RunWith(JUnit4::class)
class MainViewModelTest {


    private val testDispatcher = TestCoroutineDispatcher()
    lateinit var mainViewModel: MyViewModel

    lateinit var mainRepository: Repository

    var testlist: List<String> = mutableListOf();

    @Mock
    lateinit var apiService: RetrofitService

    @get:Rule
    val instantTaskExecutionRule: InstantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        Dispatchers.setMain(testDispatcher)
        mainRepository = mock(Repository::class.java)
        mainViewModel = MyViewModel(mainRepository)
    }

    @Test
    fun getAllHousesTest() {
        runBlocking {


            Mockito.`when`(mainRepository.getAllHouses())
                .thenReturn(NetworkState.Success(listOf<House>(House(0,"testUrl","main","","","",testlist,testlist,"",
                "","","","","",testlist,testlist,testlist))))
            mainViewModel.getAllHouses()
            val result = mainViewModel.houseList.getOrAwaitValue()
            assertEquals(listOf<House>(House(0,"testUrl","main","","","",testlist,testlist,"",
                "","","","","",testlist,testlist,testlist)), result)
        }
    }


    @Test
    fun `empty house list test`() {
        runBlocking {
            Mockito.`when`(mainRepository.getAllHouses())
                .thenReturn(NetworkState.Success(listOf<House>()))
            mainViewModel.getAllHouses()
            val result = mainViewModel.houseList.getOrAwaitValue()
            assertEquals(listOf<House>(), result)
        }
    }

}