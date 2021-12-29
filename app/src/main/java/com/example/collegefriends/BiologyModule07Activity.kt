package com.example.collegefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView

class BiologyModule07Activity : AppCompatActivity() {
    private val image7 = intArrayOf(R.drawable.slide111, R.drawable.slide112, R.drawable.slide113,R.drawable.slide114,R.drawable.slide115,R.drawable.slide116
            ,R.drawable.slide117, R.drawable.slide118, R.drawable.slide119,R.drawable.slide120, R.drawable.slide121, R.drawable.slide122,R.drawable.slide123)
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biology_module07)

        val imgSwitcher = findViewById<ImageSwitcher>(R.id.module07imageSwitcher)

        imgSwitcher?.setFactory {
            val imgView = ImageView(applicationContext)
            imgView.scaleType = ImageView.ScaleType.FIT_CENTER
            imgView.setPadding(8, 8, 8, 8)
            imgView
        }

        imgSwitcher?.setImageResource(image7[index])

        val imgIn = AnimationUtils.loadAnimation(
                this, android.R.anim.slide_in_left)
        imgSwitcher?.inAnimation = imgIn

        val imgOut = AnimationUtils.loadAnimation(
                this, android.R.anim.slide_out_right)
        imgSwitcher?.outAnimation = imgOut

        val prev = findViewById<Button>(R.id.previous)
        prev.setOnClickListener {
            index = if (index - 1 >= 0) index - 1 else 2
            imgSwitcher?.setImageResource(image7[index])
        }
        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener {
            index = if (index + 1 < image7.size) index + 1 else 0
            imgSwitcher?.setImageResource(image7[index])
        }
    }
}