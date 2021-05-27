package com.example.cat

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Tool_bar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)
        var back = findViewById<ImageView>(R.id.toolbar)



        back.setOnClickListener {
           finish()
        }
    }
}