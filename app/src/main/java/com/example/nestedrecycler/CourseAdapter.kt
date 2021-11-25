package com.example.nestedrecycler


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecycler.ApiCOntent.Course
import com.example.nestedrecycler.ApiCOntent.Data


class CourseAdapter(val course: List<Course>):RecyclerView.Adapter<CourseAdapter.ViewHolderAdapter>(){

    class ViewHolderAdapter(itemView: View):RecyclerView.ViewHolder(itemView) {
        var catname:TextView = itemView.findViewById(R.id.catname)
        val childcatname:TextView = itemView.findViewById(R.id.childcatName)
        val discount:TextView = itemView.findViewById(R.id.discountPrice)
        val id2:TextView = itemView.findViewById(R.id.id2)
        val image:ImageView = itemView.findViewById(R.id.image)
        val price:TextView = itemView.findViewById(R.id.price)
        val promovideo:TextView = itemView.findViewById(R.id.promoVideo)
        val slug2:TextView = itemView.findViewById(R.id.slug2)
        val subcatname:TextView = itemView.findViewById(R.id.subcatName)
        val subtitle:TextView = itemView.findViewById(R.id.subtitle)
        val tutorname:TextView = itemView.findViewById(R.id.tutorname)
        val tutor_id:TextView = itemView.findViewById(R.id.tutor_id)
        val title2:TextView = itemView.findViewById(R.id.title2)
        val video:TextView = itemView.findViewById(R.id.video)

        fun bindView(course: Course){
            catname.text = course.catName
            childcatname.text = course.childcatName
            discount.text = course.discountPrice
            id2.text = course.id.toString()
            price.text = course.price
            promovideo.text = course.promoVideo
            slug2.text = course.slug
            subcatname.text = course.subcatName
            subtitle.text = course.subtitle
            tutor_id.text = course.tutor_id.toString()
            title2.text = course.title
            video.text = course.video.toString()
            tutorname.text = course.tutorName

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderAdapter {
        val view2 = LayoutInflater.from(parent.context).inflate(R.layout.course,parent,false)
        return ViewHolderAdapter(view2)
    }

    override fun onBindViewHolder(holder: ViewHolderAdapter, position: Int) {
        return holder.bindView(course[position])
    }

    override fun getItemCount(): Int {
        return course.size
    }

}

