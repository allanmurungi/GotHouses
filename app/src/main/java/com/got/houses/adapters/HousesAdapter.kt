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


   // var houseList = mutableListOf<Movie>()

    fun setHouses(houses: List<House>) {
        this.houseList = houses.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.house = houseList[position]
        if (ValidationUtil.validateMovie(holder.house!!)) {
            holder.txvHouse.text = houseList[position].name

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

    override fun getItemCount(): Int {
        return houseList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val txvHouse: TextView = itemView.findViewById(R.id.txv_house)
        var house: House? = null

        override fun toString(): String {
            return """${super.toString()} '${txvHouse.text}'"""
        }
    }
}
