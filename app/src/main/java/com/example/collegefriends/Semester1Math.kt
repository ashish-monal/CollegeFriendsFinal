package com.example.collegefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView

class Semester1Math : AppCompatActivity() {

    private val image = intArrayOf(R.raw.m0003, R.raw.m0004, R.raw.m0005, R.raw.m0006, R.raw.m0007, R.raw.m0008,R.raw.m0009, R.raw.m0010, R.raw.m0011, R.raw.m0012, R.raw.m0013, R.raw.m0014,
            R.raw.m0015, R.raw.m0016, R.raw.m0017, R.raw.m0018, R.raw.m0019, R.raw.m0020,R.raw.m0021, R.raw.m0022, R.raw.m0023, R.raw.m0024, R.raw.m0025, R.raw.m0026,R.raw.m0027, R.raw.m0028, R.raw.m0029, R.raw.m0030, R.raw.m0031, R.raw.m0032,
            R.raw.m0033, R.raw.m0034, R.raw.m0035, R.raw.m0036, R.raw.m0037, R.raw.m0038,R.raw.m0039, R.raw.m0040, R.raw.m0041, R.raw.m0042, R.raw.m0043, R.raw.m0044, R.raw.m0045, R.raw.m0046, R.raw.m0047, R.raw.m0048, R.raw.m0049, R.raw.m0050)
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_semester1_math)

        val imgSwitcher = findViewById<ImageSwitcher>(R.id.MathImageSwitcher)

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