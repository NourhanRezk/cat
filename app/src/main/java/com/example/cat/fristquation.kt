package com.example.cat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_choose_age.*
import kotlinx.android.synthetic.main.activity_fristquation.*

class fristquation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fristquation)
        val  start=findViewById(R.id.next2) as Button
        next2.setOnClickListener {
            val intent = Intent(this, second::class.java).apply {
                startActivity(intent)
            }

        }

    }
}