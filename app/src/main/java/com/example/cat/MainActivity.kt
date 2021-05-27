package com.example.cat

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import mehdi.sakout.fancybuttons.FancyButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var  start= findViewById<FancyButton>(R.id.btn_start)


        start.setOnClickListener {
            var intent = Intent(this,Select::class.java)
            startActivity(intent)


        }
        }
    }
