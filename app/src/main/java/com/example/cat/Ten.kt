package com.example.cat

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import mehdi.sakout.fancybuttons.FancyButton

class Ten : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ten)
        var Finish=findViewById<FancyButton>(R.id.btn_finish)
        var back=findViewById<ImageView>(R.id.left_icon)

        Finish.setOnClickListener(){
            var intent=Intent(this,Result::class.java)
            startActivity(intent)
        }
        back.setOnClickListener()
            {
                finish()
            }

    }

}