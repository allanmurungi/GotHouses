package com.got.houses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_house_detail.*

class HouseDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_house_detail)
//initialize he action bar
        setSupportActionBar(detail_toolbar)

        // Show the Up button in the action bar.
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val bundle: Bundle? = intent.extras

        //get data passed from the previous activity
        if (bundle?.containsKey(ARG_ITEM_ID)!!) {

            val id = intent.getIntExtra(ARG_ITEM_ID, 0)
            val houseName  = intent.getIntExtra(name, 0)
            val houseRegion  = intent.getIntExtra(region, 0)
            val houseCoatOfArms  = intent.getIntExtra(coatOfArms, 0)
            val houseWords  = intent.getIntExtra(words, 0)

//display the data on the views
            loadDetails(houseName.toString(),houseRegion.toString(),houseCoatOfArms.toString(),houseWords.toString())

           // initUpdateButton(id)

            //initDeleteButton(id)
        }
    }

    //function to display data passed from  the previous activity to the views in ths activity
    private fun loadDetails(hName: String, hRegion: String, hCoatOfArms: String, hWords: String) {

        et_region.setText(hRegion)
        et_coa.setText(hCoatOfArms)
        et_words.setText(hWords)

        collapsing_toolbar.title = hName




    }
// making use od companion objects to declare and initialize constants
    companion object {

        const val ARG_ITEM_ID = "item_id"
        const val name = "name"
        const val region = "region"
        const val coatOfArms = "coatOfArms"
        const val words = "words"

    }
}