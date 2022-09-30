package com.got.houses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_house_detail.*

class HouseDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_house_detail)

        setSupportActionBar(detail_toolbar)
        // Show the Up button in the action bar.
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val bundle: Bundle? = intent.extras

        if (bundle?.containsKey(ARG_ITEM_ID)!!) {

            val id = intent.getIntExtra(ARG_ITEM_ID, 0)
            val houseName  = intent.getIntExtra(name, 0)
            val houseRegion  = intent.getIntExtra(region, 0)
            val houseCoatOfArms  = intent.getIntExtra(coatOfArms, 0)
            val houseWords  = intent.getIntExtra(words, 0)

            loadDetails(houseName.toString(),houseRegion.toString(),houseCoatOfArms.toString(),houseWords.toString())

           // initUpdateButton(id)

            //initDeleteButton(id)
        }
    }

    private fun loadDetails(hName: String, hRegion: String, hCoatOfArms: String, hWords: String) {

        et_region.setText(hRegion)
        et_coa.setText(hCoatOfArms)
        et_words.setText(hWords)

        collapsing_toolbar.title = hName




    }

    companion object {

        const val ARG_ITEM_ID = "item_id"
        const val name = "name"
        const val region = "region"
        const val coatOfArms = "coatOfArms"
        const val words = "words"

    }
}