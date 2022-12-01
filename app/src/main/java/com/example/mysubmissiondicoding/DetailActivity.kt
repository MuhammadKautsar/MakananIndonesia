package com.example.mysubmissiondicoding

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvDetails: TextView = findViewById(R.id.tv_item_detail)
        val tvPhoto: ImageView = findViewById(R.id.img_item_photo)
//        val favButton: Button = findViewById(R.id.btn_fav)

        val foodName = intent.getStringExtra("mName")
        val foodDetails = intent.getStringExtra("mDetail")
        val foodPhoto = intent.getIntExtra("mPhoto", 1)

        tvName.text = foodName
        tvDetails.text = foodDetails
        tvPhoto.setImageResource(foodPhoto)

        supportActionBar?.title = foodName

    }
}