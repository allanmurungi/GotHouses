package com.got.houses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_house_detail.*

class HouseDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_house_detail)
//initialize the action bar
        setSupportActionBar(detail_toolbar)

        // Show the Up button in the action bar.
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val bundle: Bundle? = intent.extras

        //get data passed from the previous activity
        if (bundle?.containsKey(ARG_ITEM_ID)!!) {

            val id = intent.getIntExtra(ARG_ITEM_ID, 0)
            val houseName  = intent.getStringExtra(name)
            val houseRegion  = intent.getStringExtra(region)
            val houseCoatOfArms  = intent.getStringExtra(coatOfArms)
            val houseWords  = intent.getStringExtra(words)

            Toast.makeText(this@HouseDetailActivity, houseName.toString(), Toast.LENGTH_LONG).show()


//display the data on the views
            loadDetails(houseName.toString(),houseRegion.toString(),houseCoatOfArms.toString(),houseWords.toString())


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