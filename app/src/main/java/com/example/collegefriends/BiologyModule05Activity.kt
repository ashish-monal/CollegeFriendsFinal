package com.example.collegefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView

class BiologyModule05Activity : AppCompatActivity() {

    private val image4 = intArrayOf(R.drawable.sliden01, R.drawable.sliden02, R.drawable.sliden03,R.drawable.sliden04,R.drawable.sliden05,R.drawable.sliden06
            ,R.drawable.sliden07, R.drawable.sliden08, R.drawable.sliden09,R.drawable.sliden10)
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biology_module05)


        val imgSwitcher = findViewById<ImageSwitcher>(R.id.module05imageSwitcher)

        imgSwitcher?.setFactory {
            val imgView = ImageView(applicationContext)
            imgView.scaleType = ImageView.ScaleType.FIT_CENTER
            imgView.setPadding(8, 8, 8, 8)
            imgView
        }

        imgSwitcher?.setImageResource(image4[index])

        val imgIn = AnimationUtils.loadAnimation(
                this, android.R.anim.slide_in_left)
        imgSwitcher?.inAnimation = imgIn

        val imgOut = AnimationUtils.loadAnimation(
                this, android.R.anim.slide_out_right)
        imgSwitcher?.outAnimation = imgOut

        val prev = findViewById<Button>(R.id.previous)
        prev.setOnClickListener {
            index = if (index - 1 >= 0) index - 1 else 2
            imgSwitcher?.setImageResource(image4[index])
        }
        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener {
            index = if (index + 1 < image4.size) index + 1 else 0
            imgSwitcher?.setImageResource(image4[index])
        }
    }
}