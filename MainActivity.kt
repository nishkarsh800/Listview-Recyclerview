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

        val cityNames = arrayOf("Delhi","Agra","Mathura","Chandigarh","Jaipur","Noida","Gurgaon")

        val cities = findViewById<ListView>(R.id.cities)

        val cityAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, cityNames)

        cities.adapter = cityAdapter

        cities.setOnItemClickListener { adapterView, view, position, id ->
            val city: TextView = view as TextView
            Toast.makeText(this,city.text, Toast.LENGTH_SHORT).show()
        }
    }
}
