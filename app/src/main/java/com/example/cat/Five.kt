package com.example.cat

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cat.Select.Companion.questionList
import com.example.cat.webservices.Model
import kotlinx.android.synthetic.main.activity_five.*
import mehdi.sakout.fancybuttons.FancyButton

class Five : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)
        var  next= findViewById<FancyButton>(R.id.btn_next6)
        var  back= findViewById<ImageView>(R.id.left_icon)
        var flag=0
        btn_FiveYes.setOnCheckedChangeListener { compoundButton, b ->
            flag=1
        }
        btn_FiveNo.setOnCheckedChangeListener { compoundButton, b ->
            flag=2
        }

        next.setOnClickListener {
            if (flag>0){
             var answer=""
                if (flag==1)
                    answer="yes"
                else
                    answer="no"
                questionList.add(Model("5",answer))
                var intent = Intent(this,Six::class.java)
                startActivity(intent)

            }else{
                Toast.makeText(this, "please choose an answer", Toast.LENGTH_SHORT).show()}

        }


        back.setOnClickListener {
            finish()
        }
    }
}