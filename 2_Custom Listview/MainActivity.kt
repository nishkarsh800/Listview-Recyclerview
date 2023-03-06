package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var userArrayList : ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.listview)

        val name = arrayOf("SRK", "SSR", "Pankaj", "Nawaz", "Raftaar", "Badshah")
        val lastMsg = arrayOf("Romance King", "Self Musing", "Chup rahiye", "Marna hai kya?", "RAAA", "Paani Paani")
        val lastMsgTime = arrayOf("6:00 AM", "9:25 AM", "8:00 AM", "10:30 AM", "4:30 PM", "9:15 PM")
        val phone = arrayOf("7776", "1283", "6564", "3012", "4333", "3331")
        val imgId = intArrayOf(R.drawable.a,R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f)

        userArrayList = ArrayList()

        for(idx in name.indices){
            val user = User(name[idx], lastMsg[idx], lastMsgTime[idx], phone[idx], imgId[idx])
            userArrayList.add(user)  //add user in my arrayList
        }

        // make an adapter now, since the data is ready
        listview.adapter = MyAdapter(this,userArrayList)

    }
}