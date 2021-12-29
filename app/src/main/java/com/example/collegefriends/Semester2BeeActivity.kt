package com.example.collegefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView

class Semester2BeeActivity : AppCompatActivity() {

    private val image = intArrayOf(R.raw.bee01,R.raw.bee02,R.raw.bee03,R.raw.bee04,R.raw.bee05,R.raw.bee06,R.raw.bee07,R.raw.bee08,R.raw.bee09,R.raw.bee10,R.raw.bee11,R.raw.bee12,R.raw.bee13,R.raw.bee14,R.raw.bee15)
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_semester2_bee)

        val imgSwitcher = findViewById<ImageSwitcher>(R.id.BEEimageSwitcher)

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