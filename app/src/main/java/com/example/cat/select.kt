package com.example.cat

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import de.hdodenhof.circleimageview.CircleImageView
import mehdi.sakout.fancybuttons.FancyButton

class select : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)
        var  next= findViewById<FancyButton>(R.id.btn_next)
        var  back= findViewById<ImageView>(R.id.left_icon)

        var  profile= findViewById<CircleImageView>(R.id.profile_image1)




        next.setOnClickListener {
            var intent = Intent(this,fristquation::class.java)
            startActivity(intent)

        }

        back.setOnClickListener {
          finish()

        }

        profile.setOnClickListener {
            var intent = Intent(this,fristquation::class.java)
            startActivity(intent)
        }

    }
}