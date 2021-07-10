package com.example.cat

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        var back = findViewById<ImageView>(R.id.left_icon)
//        val retrofit = RetrofitBuilder().getRetrofit()
//        val service = retrofit.create(ApiService::class.java)
//        val call = service.getResult(ResultRequest())

//        call.enqueue(object : Callback<ResultResponse> {
//            override fun onResponse(
//                call: Call<ResultResponse>,
//                response: Response<ResultResponse>
//            ) {
//                if (response.code() == 200) {
//                    val ResultResponse  = response.body()!!
//
//                }
//            }
//
//            override fun onFailure(call: Call<ResultResponse>, t: Throwable) {
//
//            }
//        })
//

        var yes =0
        var no =0


        for (item in Select.questionList){
            if(item.answer.equals("yes")){
                yes++
            }else
                no++
        }

        if(yes==no){
            tv_res.text="yes"
        }else if (yes >no){
            tv_res.text="yes"

        }else{
            tv_res.text="no"

        }

        back.setOnClickListener {
            finish()
        }
    }
}