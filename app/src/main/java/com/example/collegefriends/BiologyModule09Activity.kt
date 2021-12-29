package com.example.collegefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView

class BiologyModule09Activity : AppCompatActivity() {

    private val image9 = intArrayOf(R.drawable.slide153, R.drawable.slide154, R.drawable.slide155, R.drawable.slide156, R.drawable.slide157, R.drawable.slide158, R.drawable.slide159, R.drawable.slide160, R.drawable.slide161, R.drawable.slide162, R.drawable.slide163, R.drawable.slide164, R.drawable.slide165)
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biology_module09)

        val imgSwitcher = findViewById<ImageSwitcher>(R.id.module09imageSwitcher)

        imgSwitcher?.setFactory {
            val imgView = ImageView(applicationContext)
            imgView.scaleType = ImageView.ScaleType.FIT_CENTER
            imgView.setPadding(8, 8, 8, 8)
            imgView
        }

        imgSwitcher?.setImageResource(image9[index])

        val imgIn = AnimationUtils.loadAnimation(
                this, android.R.anim.slide_in_left)
        imgSwitcher?.inAnimation = imgIn

        val imgOut = AnimationUtils.loadAnimation(
                this, android.R.anim.slide_out_right)
        imgSwitcher?.outAnimation = imgOut

        val prev = findViewById<Button>(R.id.previous)
        prev.setOnClickListener {
            index = if (index - 1 >= 0) index - 1 else 2
            imgSwitcher?.setImageResource(image9[index])
        }
        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener {
            index = if (index + 1 < image9.size) index + 1 else 0
            imgSwitcher?.setImageResource(image9[index])
        }
    }
}