package com.example.nestedrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.nestedrecycler.ApiCOntent.ApiDetaiil
import com.example.nestedrecycler.ApiCOntent.Course
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course)

        val recycler1 = findViewById<RecyclerView>(R.id.recycler_1)
        val recycler2 = findViewById<RecyclerView>(R.id.recycler_2)
        val service = Service.buildService(Api::class.java)
        val call = service.getData()
        val call1 = service.getCourse()
        call.enqueue(object : Callback<ApiDetaiil>{
            override fun onResponse(
                call: Call<ApiDetaiil>,
                response: Response<ApiDetaiil>
            ) {
                if (response.isSuccessful){
                    recycler1.apply {
                        layoutManager = LinearLayoutManager(this@MainActivity)
                         val data1 = response.body()?.data?.let {
                             adapter = DataAdapter(it)
                         }
                        val imagePath = findViewById<ImageView>(R.id.pic)
                        Glide.with(this@MainActivity)
                            .load("https://rank2top.com/api/home_list")
                            .into(imagePath)
                    }
                }
            }

            override fun onFailure(call: Call<ApiDetaiil>, t: Throwable){
                t.printStackTrace()
                Log.d("error occured",t.message.toString())
            }

        })
        call1.enqueue(object :Callback<ApiDetaiil>{
            override fun onResponse(
                call: Call<ApiDetaiil>,
                response: Response<ApiDetaiil>
            ) {
                if (response.isSuccessful){
                    recycler2.apply {
                        layoutManager = LinearLayoutManager(this@MainActivity)
                        val data2 = response.body()?.data?.let {
                            adapter = CourseAdapter(it)
                        }

                    }
                }
            }

            override fun onFailure(call: Call<ApiDetaiil>, t: Throwable) {
                Log.d("Error occured 2",t.message.toString())
            }

        })
    }
}