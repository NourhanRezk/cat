package com.example.cat

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.cat.webservices.ApiService
import com.example.cat.webservices.ResultRequest
import com.example.cat.webservices.ResultResponse
import com.example.cat.webservices.RetrofitBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        var back = findViewById<ImageView>(R.id.left_icon)
        val retrofit = RetrofitBuilder().getRetrofit()
        val service = retrofit.create(ApiService::class.java)
        val call = service.getResult(ResultRequest())

        call.enqueue(object : Callback<ResultResponse> {
            override fun onResponse(
                call: Call<ResultResponse>,
                response: Response<ResultResponse>
            ) {
                if (response.code() == 200) {
                    val ResultResponse  = response.body()!!

                }
            }

            override fun onFailure(call: Call<ResultResponse>, t: Throwable) {

            }
        })





        back.setOnClickListener {
            finish()
        }
    }
}