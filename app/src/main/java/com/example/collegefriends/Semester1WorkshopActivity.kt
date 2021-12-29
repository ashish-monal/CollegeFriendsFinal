package com.example.collegefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView

class Semester1WorkshopActivity : AppCompatActivity() {

    private val image = intArrayOf(R.raw.wp01,R.raw.wp02,R.raw.wp03,R.raw.wp04,R.raw.wp05,R.raw.wp06,R.raw.wp07,R.raw.wp08,R.raw.wp09,R.raw.wp10,R.raw.wps01,R.raw.wps02,R.raw.wps03,R.raw.wps04,R.raw.wps05,R.raw.wps06,R.raw.wps07,R.raw.wps08,R.raw.wps09,R.raw.wps10)
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_semester1_workshop)

        val imgSwitcher = findViewById<ImageSwitcher>(R.id.WorkshopImageSwitcher)

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