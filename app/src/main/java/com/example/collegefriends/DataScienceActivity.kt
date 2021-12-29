package com.example.collegefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView

class DataScienceActivity : AppCompatActivity() {

    private val image = intArrayOf(R.drawable.ds1, R.drawable.ds2, R.drawable.ds3, R.drawable.ds4, R.drawable.ds5, R.drawable.ds6, R.drawable.ds7, R.drawable.ds8, R.drawable.ds9
            , R.drawable.ds10, R.drawable.ds11, R.drawable.ds12, R.drawable.ds13, R.drawable.ds14, R.drawable.ds15, R.drawable.ds16, R.drawable.ds17,R.drawable.ds18)
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_science)

        val imgSwitcher = findViewById<ImageSwitcher>(R.id.DataScienceImageSwitcher)

        imgSwitcher?.setFactory {
            val imgView = ImageView(applicationContext)
            imgView.scaleType = ImageView.ScaleType.FIT_CENTER
            imgView.setPadding(8, 8, 8, 8)
            imgView
        }

        imgSwitcher?.setImageResource(image[index])

        val imgIn = AnimationUtils.loadAnimation(
                this, android.R.anim.slide_in_left)
        imgSwitcher?.inAnimation = imgIn

        val imgOut = AnimationUtils.loadAnimation(
                this, android.R.anim.slide_out_right)
        imgSwitcher?.outAnimation = imgOut

        val prev = findViewById<Button>(R.id.previous)
        prev.setOnClickListener {
            index = if (index - 1 >= 0) index - 1 else 2
            imgSwitcher?.setImageResource(image[index])
        }
        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener {
            index = if (index + 1 < image.size) index + 1 else 0
            imgSwitcher?.setImageResource(image[index])
        }

    }
}