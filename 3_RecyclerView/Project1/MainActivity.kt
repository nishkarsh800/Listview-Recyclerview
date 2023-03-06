package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var myRecyclerView : RecyclerView
    lateinit var newsArrayList: ArrayList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.recyclerView)

        // Making data for ArrayList

        val imgArray = arrayOf(R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j)
        val newsHeadingArray = arrayOf("Shahrukh Khan's Pathaan film hits 1000 crore club",
            "Sushant is still remembered by his fans", "Pankaj Tripathi bold look in Mirzapur 3",
            "Nawaz believes that he is God and should be worshipped", "Raftaar dropped a new EP with Prabhdeep",
            "Badshah dropped a new Album 3AM SESSIONS", "Virat Kohli hits another century", "Modiji wants to remove Kejriwal from Delhi",
            "Amit Shah says I am not Mota bhai", "Shreyas is my brother says Chahal")

        // to set behavior of items inside the recycler view i.e. scrolling behavior etc.
        // layout manager calls 3 methods for the recycler view.
        myRecyclerView.layoutManager = LinearLayoutManager(this)
        newsArrayList = arrayListOf<News>()

          for(idx in imgArray.indices){
              val news = News(newsHeadingArray[idx],imgArray[idx])
              newsArrayList.add(news)
          }

        // Now set the Adapter
        myRecyclerView.adapter = MyAdapter(newsArrayList, this)

    }
}