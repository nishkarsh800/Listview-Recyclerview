package com.example.recyclerview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

// Har adapter se related ek viewholder hota hai
// 3 Methods are there to implement the recycler view

class MyAdapter(var newsArrayList: ArrayList<News>, var context : Activity) :
RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
       // if layout manager fails to find a suitable view for each item then it calls this method to create new view instance

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.eachitem, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        //populates the data into the views
        var currentItem = newsArrayList[position]
        holder.headingTitle.text = currentItem.newsHeading
        holder.headingImage.setImageResource(currentItem.newsImg)

    }

    override fun getItemCount(): Int {
        // how much items are present in your array?
        return newsArrayList.size
    }

    //It holds the views so that views are not created everytime, so that the memory can be saved
    class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val headingTitle = itemView.findViewById<TextView>(R.id.titleHeading)
        val headingImage = itemView.findViewById<ShapeableImageView>(R.id.headingImg)
    }

}