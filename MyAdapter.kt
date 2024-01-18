package com.example.createmission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val userList: ArrayList<User>): RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    val Name: TextView=itemView.findViewById(R.id.JudulMission)
        val description : TextView = itemView.findViewById(R.id.description)
        val harga: TextView = itemView. findViewById(R.id.Harga)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
val itemView=LayoutInflater.from(parent.context).inflate(R.layout.daftar_misi, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.Name.text=userList[position].name
        holder.description.text=userList[position].berikan_komentar
        holder.harga.text=userList[position].harga
    }
}