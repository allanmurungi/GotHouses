package com.got.houses.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.got.houses.HouseDetailActivity
import com.got.houses.R
import com.got.houses.models.House
import com.got.houses.utils.ValidationUtil
//import com.got.houses.adapters.databinding.AdapterHouseBinding

class HousesAdapter (private var houseList: List<House>) : RecyclerView.Adapter<HousesAdapter.ViewHolder>() {



//set the houses list
    fun setHouses(houses: List<House>) {
        this.houseList = houses.toMutableList()
        notifyDataSetChanged()
    }
//binding the individual list item layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }
//binding  data to the views in the individual list item view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.house = houseList[position]
        if (ValidationUtil.validateMovie(holder.house!!)) {
            holder.txvHouse.text = houseList[position].name

//once clicked, go to the HouseDetailsACtivity wth some bundled data
        holder.itemView.setOnClickListener { v ->
            val context = v.context
            val intent = Intent(context, HouseDetailActivity::class.java)
            intent.putExtra(HouseDetailActivity.ARG_ITEM_ID, holder.house!!.id)
            intent.putExtra("name", holder.house!!.name.toString())
            intent.putExtra("region", holder.house!!.region.toString())
            intent.putExtra("coatOfArms", holder.house!!.coatOfArms.toString())
            intent.putExtra("word", holder.house!!.words.toString())
            intent.putExtra("currentLord", holder.house!!.currentLord.toString())
            intent.putExtra("heir", holder.house!!.heir.toString())
            intent.putExtra("overlord", holder.house!!.overLord.toString())
            intent.putExtra("founded", holder.house!!.founded.toString())
            intent.putExtra("founder", holder.house!!.founder.toString())
            intent.putExtra("url", holder.house!!.url.toString())


            context.startActivity(intent)
        }
        }
    }

    //get total umber of list items
    override fun getItemCount(): Int {
        return houseList.size
    }

    //defining the view holder class that instatiates the views in the individual list item view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val txvHouse: TextView = itemView.findViewById(R.id.txv_house)
        var house: House? = null

        override fun toString(): String {
            return """${super.toString()} '${txvHouse.text}'"""
        }
    }
}
