package com.example.collegefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView

class BiologyModule06Activity : AppCompatActivity() {

    private val image4 = intArrayOf(R.drawable.slideo01, R.drawable.slideo02, R.drawable.slideo03,R.drawable.slideo04,R.drawable.slideo05,R.drawable.slideo06)
    private var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biology_module06)

        val imgSwitcher = findViewById<ImageSwitcher>(R.id.module06imageSwitcher)

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