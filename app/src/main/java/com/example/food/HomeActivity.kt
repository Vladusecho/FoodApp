package com.example.food

import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.SearchView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val typeface = Typeface.createFromAsset(assets, "fonts/Sen-Regular.ttf")

        val delSpinner = findViewById<Spinner>(R.id.del_spinner)
        val delList = arrayOf("Halal lab office", "Yandex office", "St. Sevskaya, h. 18")
        val delAdapter = ArrayAdapter<Any?>(this, R.layout.spinner_list, delList)
        delAdapter.setDropDownViewResource(R.layout.drop_list)
        delSpinner.adapter = delAdapter

        val searchBar = findViewById<SearchView>(R.id.search_bar)

    }
}