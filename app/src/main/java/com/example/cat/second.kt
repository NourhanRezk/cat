package com.example.cat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_fristquation.*
import kotlinx.android.synthetic.main.activity_second.*

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val start = findViewById(R.id.next3) as Button
        next3.setOnClickListener {
            val intent = Intent(this, third::class.java).apply {
                startActivity(intent)
            }

        }
    }
}