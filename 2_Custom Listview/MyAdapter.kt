package com.example.listview

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

/* This adapter takes 2 parameters from the Main Activity which is context and arraylist and
this adapter will extend built in ArrayAdapter in which we would be passing 3 parameters */

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<User>) :
    ArrayAdapter<User>(context, R.layout.eachrow, arrayList) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)

        //eachrow wali xml file se har row ka data set kro ab
        val view = inflater.inflate(R.layout.eachrow, null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.tvName)
        val lastMsg = view.findViewById<TextView>(R.id.lastMessage)
        val lastMsgTime = view.findViewById<TextView>(R.id.lastMessageTime)

        //setting the above values for different users
        name.text = arrayList[position].name
        lastMsg.text = arrayList[position].lastMsg
        lastMsgTime.text = arrayList[position].lastMsgTime
        image.setImageResource(arrayList[position].imgId)

        return view
    }
}