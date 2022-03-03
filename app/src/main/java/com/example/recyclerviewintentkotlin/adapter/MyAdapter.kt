package com.example.recyclerviewintentkotlin.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewintentkotlin.R
import com.example.recyclerviewintentkotlin.model.ListData
import com.example.recyclerviewintentkotlin.view.SecondActivity


/**
 * Created by Eldor Turgunov
 * Project: RecyclerView Intent Kotlin
 * Date: 03.03.2022
 * Time: 16:45
 */

class MyAdapter(val context: Context, private val listData: List<ListData>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var title: TextView = itemView.findViewById(R.id.tv_title)
        var image: ImageView = itemView.findViewById(R.id.iv_image)
        override fun onClick(v: View?) {
            val position = adapterPosition

            val listData: Int = position

            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("img", listData.image)
            intent.putExtra("title", title)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data: ListData = listData[position]
        holder.image.setImageResource(data.image)
        holder.title.text = data.title
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}