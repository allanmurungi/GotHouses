package com.got.houses.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.got.houses.models.House
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*

class MyViewModel constructor(private val mainRepository: Repository) : ViewModel() {

    //live data object to help with rendering on the views
    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String>
        get() = _errorMessage




// collection to store houses data
    val houseList = MutableLiveData<List<House>>()

    var job: Job? = null



// defining the coroutine exception handler
    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        onError("Exception handled: ${throwable.localizedMessage}")
    }
    val loading = MutableLiveData<Boolean>()

    //make betwork call using launch to get data from backend server
    fun getAllHouses() {
        Log.d("Thread Outside", Thread.currentThread().name)

        viewModelScope.launch {
            Log.d("Thread Inside", Thread.currentThread().name)
            when (val response = mainRepository.getAllHouses()) {
                is NetworkState.Success-> {
                    houseList.postValue(response.data)
                }
                is NetworkState.Error -> {
                    if (response.response.code() == 401) {
                        //HouseList.postValue(NetworkState.Error())
                    } else {
                        //HouseList.postValue(NetworkState.Error)
                    }
                }

            }
        }
    }
//when an error occurs stop, get the message
    private fun onError(message: String) {
        _errorMessage.value = message
        loading.value = false
    }

    override fun onCleared() {
        super.onCleared()
        job?.cancel()
    }

}

