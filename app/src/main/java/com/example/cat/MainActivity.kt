package com.example.cat

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import mehdi.sakout.fancybuttons.FancyButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var  start= findViewById<FancyButton>(R.id.btn_start)
        var  back= findViewById<ImageView>(R.id.left_icon)



        start.setOnClickListener {
            var intent = Intent(this, chooseAge::class.java)
            startActivity(intent)

        }

        back.setOnClickListener {
          Toast.makeText(this,"Back",Toast.LENGTH_SHORT).show()

        }
    }
}