package com.example.collegefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView

class BiologyModule03Activity : AppCompatActivity() {
    private val image3 = intArrayOf(R.drawable.slide31, R.drawable.slide32, R.drawable.slide33,R.drawable.slide33,R.drawable.slide34,R.drawable.slide35
            ,R.drawable.slide36, R.drawable.slide37, R.drawable.slide38,R.drawable.slide39,R.drawable.slide40,R.drawable.slide41,R.drawable.slide42)
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biology_module03)


        val imgSwitcher = findViewById<ImageSwitcher>(R.id.module03imageSwitcher)

        imgSwitcher?.setFactory {
            val imgView = ImageView(applicationContext)
            imgView.scaleType = ImageView.ScaleType.FIT_CENTER
            imgView.setPadding(8, 8, 8, 8)
            imgView
        }

        imgSwitcher?.setImageResource(image3[index])

        val imgIn = AnimationUtils.loadAnimation(
                this, android.R.anim.slide_in_left)
        imgSwitcher?.inAnimation = imgIn

        val imgOut = AnimationUtils.loadAnimation(
                this, android.R.anim.slide_out_right)
        imgSwitcher?.outAnimation = imgOut

        val prev = findViewById<Button>(R.id.previous)
        prev.setOnClickListener {
            index = if (index - 1 >= 0) index - 1 else 2
            imgSwitcher?.setImageResource(image3[index])
        }
        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener {
            index = if (index + 1 < image3.size) index + 1 else 0
            imgSwitcher?.setImageResource(image3[index])
        }

    }
}