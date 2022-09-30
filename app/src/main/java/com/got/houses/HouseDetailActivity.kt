package com.got.houses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HouseDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_house_detail)
    }

    companion object {

        const val ARG_ITEM_ID = "item_id"
    }
}