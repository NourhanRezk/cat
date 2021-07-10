package com.example.cat.webservices

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitBuilder {

    fun getRetrofit():Retrofit{
        return  Retrofit.Builder()
            .baseUrl("https://github.com/user/repo.git/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

     }


 }
