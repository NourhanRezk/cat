package com.example.cat

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class Splash : AppCompatActivity() {
    // Splash screen timer
    private val SPLASH_TIME_OUT = 3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.cat.R.layout.activity_splash)
        Handler().postDelayed(
            {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }, SPLASH_TIME_OUT)
    }
}  


