package com.example.cat

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import mehdi.sakout.fancybuttons.FancyButton

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var  next= findViewById<FancyButton>(R.id.btn_next3)
        var  back= findViewById<ImageView>(R.id.left_icon)



        next.setOnClickListener {
            var intent = Intent(this,third::class.java)
            startActivity(intent)

        }

        back.setOnClickListener {
            Toast.makeText(this,"Back", Toast.LENGTH_SHORT).show()

        }
    }
}

