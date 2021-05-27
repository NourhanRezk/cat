package com.example.cat.webservices

import retrofit2.Call
import retrofit2.http.POST

interface ApiService {

    @POST("data/2.5/weather?")
    fun getResult(request: ResultRequest): Call<ResultResponse>

}