package com.example.recycleview_test_1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview_test_1.R
import com.example.recycleview_test_1.model.Shoes
import kotlinx.android.synthetic.main.item_shoes.view.*


class Shoes_Adapter (var shoeList: ArrayList<Shoes>) : RecyclerView.Adapter<Shoes_Adapter.ShoesViewHolder>(){
    inner class ShoesViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bindShoes(shoes : Shoes){
            itemView.txtView1.text = shoes.name
            itemView.txtView2.text = shoes.size
            itemView.priceView.text = shoes.price
            itemView.iconView.setImageResource(shoes.icon)
            itemView.imgView.setImageResource(shoes.image)
            itemView.numberView.text = shoes.number
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoesViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_shoes, parent, false)
        return ShoesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return shoeList.size
    }

    override fun onBindViewHolder(holder: ShoesViewHolder, position: Int) {
        holder.bindShoes(shoeList[position])
    }
}