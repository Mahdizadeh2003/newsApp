package com.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val newsList = mutableListOf<News>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialRecView()
        lifecycleScope.launch {

        }
    }

    private fun initialRecView() {
        val recView = findViewById<RecyclerView>(R.id.recView)
        val newsAdopter = NewsAdopter(newsList, this)
        recView.adapter = newsAdopter
        recView.layoutManager = LinearLayoutManager(this)
    }
}