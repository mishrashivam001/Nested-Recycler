package com.example.nestedrecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.nestedrecycler.ApiCOntent.Data


class DataAdapter(val data: List<Data>):RecyclerView.Adapter<DataAdapter.ViewHolderAdapter1>() {
    class ViewHolderAdapter1(itemView:View):RecyclerView.ViewHolder(itemView) {
        val course:TextView = itemView.findViewById(R.id.course_name)
        val created_at:TextView = itemView.findViewById(R.id.created_at)
        val slug:TextView = itemView.findViewById(R.id.slug)
        val hompage:TextView = itemView.findViewById(R.id.homepage)
        val id:TextView = itemView.findViewById(R.id.id)
        val pic:TextView = itemView.findViewById(R.id.pic)
        val sorting:TextView = itemView.findViewById(R.id.sorting)
        val status:TextView = itemView.findViewById(R.id.status)
        val title:TextView = itemView.findViewById(R.id.title)
        val updated_at:TextView = itemView.findViewById(R.id.updated_at)

        fun bindView2(data: Data){
            course.text = data.courses.toString()
            created_at.text = data.created_at
            slug.text = data.slug
            hompage.text = data.homepage
            id.text = data.id.toString()
            pic.text = data.pic
            sorting.text = data.sorting.toString()
            status.text = data.status
            title.text = data.title
            updated_at.text = data.updated_at
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderAdapter1 {
        val view  = LayoutInflater.from(parent.context).inflate(R.layout.data,parent,false)
        return ViewHolderAdapter1(view)
    }

    override fun onBindViewHolder(holder: ViewHolderAdapter1, position: Int) {
         return holder.bindView2(data[position])
    }

    override fun getItemCount(): Int {
      return data.size
    }
}