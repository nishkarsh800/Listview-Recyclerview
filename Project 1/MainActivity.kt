package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.listview)

        val taskList = arrayOf("Eating", "Read Book", "Complete the project", "Learn HTML", "Go market", "Upload a Video")

        //adapter gives data to the listview
        val myAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, taskList)
        listview.adapter = myAdapter
        
        listview.setOnItemClickListener { parent, view, position, id->  
            val text = "Clicked on Item : " + (view as TextView).text.toString()
            Toast.makeText(this,text, Toast.LENGTH_SHORT).show()
        }

    }
}
