package com.example.nestedrecycler.ApiCOntent

import java.io.Serializable

data class Data(
    val courses: List<Course>,
    val created_at: String,
    val homepage: String,
    val id: Int,
    val pic: String,
    val slug: String,
    val sorting: Int,
    val status: String,
    val title: String,
    val updated_at: String
)
