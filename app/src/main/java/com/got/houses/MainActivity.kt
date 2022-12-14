package com.got.houses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.got.houses.adapters.HousesAdapter
import com.got.houses.viewmodel.MyViewModel
import com.got.houses.databinding.ActivityMainBinding
import com.got.houses.viewmodel.MyViewModelFactory
import com.got.houses.viewmodel.Repository
import androidx.lifecycle.Observer
import com.got.houses.models.House
import com.got.houses.services.RetrofitService



class MainActivity : AppCompatActivity() {

//declare variables
    var houseList: List<House> = mutableListOf();
    lateinit var viewModel: MyViewModel
    private val adapter = HousesAdapter(houseList)
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//get retrofit service instance
        val retrofitService = RetrofitService.getInstance()
        val mainRepository = Repository(retrofitService)
        binding.houseRecyclerView.adapter = adapter

        viewModel = ViewModelProvider(this, MyViewModelFactory(mainRepository)).get(MyViewModel::class.java)

//get viewmodel instance using ViewModelProvider.Factory
        viewModel =
            ViewModelProvider(this, MyViewModelFactory(Repository(retrofitService))).get(
                MyViewModel::class.java
            )

        //set adapter in recyclerview
        binding.houseRecyclerView.adapter = adapter

        //the observer will only receive events if the owner(activity) is in active state
        //invoked when houseList data changes
        viewModel.houseList.observe(this, Observer {
            Log.d(TAG, "houseList: $it")
            adapter.setHouses(it)
        })

        //invoked when a network exception occurred
        viewModel.errorMessage.observe(this, Observer {
            Log.d(TAG, "errorMessage: $it")
        })

        viewModel.getAllHouses()
    }
// companion object to declare and initialize constants
    companion object
    {

        const val TAG="MainActivity"
    }
}