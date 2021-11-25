package com.example.nestedrecycler.ApiCOntent

import java.io.Serializable

data class Course(
    val catName: String,
    val childcatName: String,
    val discountPrice: String,
    val id: Int,
    val img: String,
    val price: String,
    val promoVideo: String,
    val slug: String,
    val subcatName: String,
    val subtitle: String,
    val title: String,
    val tutorName: String,
    val tutor_id: Int,
    val video: Any
)