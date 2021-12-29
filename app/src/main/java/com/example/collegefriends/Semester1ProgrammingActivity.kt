package com.example.collegefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView

class Semester1ProgrammingActivity : AppCompatActivity() {

    private val image = intArrayOf(R.raw.pps01,R.raw.pps02,R.raw.pps03,R.raw.pps04,R.raw.pps01,R.raw.pps05,R.raw.pps06,R.raw.pps07,R.raw.pps08,R.raw.pps09,R.raw.pps10,R.raw.pps11,R.raw.pps12,R.raw.pps13,R.raw.pps14,R.raw.pps15,R.raw.pps16,R.raw.pps17,R.raw.pps18,R.raw.pps19,R.raw.pps20,R.raw.pps21,R.raw.pps22,R.raw.pps23,R.raw.pps24,R.raw.pps25,R.raw.pps26,R.raw.pps27,R.raw.pps28,R.raw.pps29,R.raw.pps30,R.raw.pps31,R.raw.pps32,R.raw.pps33,R.raw.pps34,R.raw.pps35,R.raw.pps36,R.raw.pps37,R.raw.pps38,R.raw.pps39,R.raw.pps40,R.raw.pps41,R.raw.pps42,R.raw.pps43,R.raw.pps44,R.raw.pps45,R.raw.pps46,R.raw.pps47,R.raw.pps48,R.raw.pps49,R.raw.pps50)
            private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_semester1_programming)

        val imgSwitcher = findViewById<ImageSwitcher>(R.id.ProgrammingImageSwitcher)

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