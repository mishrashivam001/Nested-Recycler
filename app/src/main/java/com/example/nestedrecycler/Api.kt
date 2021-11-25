package com.example.nestedrecycler

import com.example.nestedrecycler.ApiCOntent.ApiDetaiil
import com.example.nestedrecycler.ApiCOntent.Course
import retrofit2.Call
import com.example.nestedrecycler.ApiCOntent.Data
import retrofit2.http.GET

interface Api {
    @GET("/home_list")
    fun getData():Call<ApiDetaiil>
    fun getCourse():Call<ApiDetaiil>
}