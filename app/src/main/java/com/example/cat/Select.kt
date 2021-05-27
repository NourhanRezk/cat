package com.example.cat

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cat.webservices.Model
import de.hdodenhof.circleimageview.CircleImageView

class Select : AppCompatActivity() {
    companion object {
        var questionList: ArrayList<Model> = ArrayList()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)

        var  profile0= findViewById<CircleImageView>(R.id.profile_image1)
        var  profile= findViewById<CircleImageView>(R.id.profile_image2)






        profile.setOnClickListener {
            var intent = Intent(this,FirstQuestion::class.java)
            startActivity(intent)
        }
        profile0.setOnClickListener {
            var intent = Intent(this,FirstQuestion::class.java)
            startActivity(intent)
        }


    }
}