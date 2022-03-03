package com.example.recyclerviewintentkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewintentkotlin.R
import com.example.recyclerviewintentkotlin.adapter.MyAdapter
import com.example.recyclerviewintentkotlin.databinding.ActivityMainBinding
import com.example.recyclerviewintentkotlin.model.ListData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()

    }

    private fun initViews() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        val list = ArrayList<ListData>()
        list.add(ListData(R.drawable.java, "Java"))
        list.add(ListData(R.drawable.kotlin, "Kotlin"))
        list.add(ListData(R.drawable.php, "PHP"))
        list.add(ListData(R.drawable.cplusplus, "C++"))
        list.add(ListData(R.drawable.js, "Java Script"))
        list.add(ListData(R.drawable.java, "Java"))
        list.add(ListData(R.drawable.kotlin, "Kotlin"))
        list.add(ListData(R.drawable.php, "PHP"))
        list.add(ListData(R.drawable.cplusplus, "C++"))
        list.add(ListData(R.drawable.js, "Java Script"))
        val adapter = MyAdapter(this, list)
        recyclerView.adapter = adapter

    }
}