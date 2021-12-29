package com.example.collegefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView

class BiologyModule04Activity : AppCompatActivity() {

    private val image4 = intArrayOf(R.drawable.slidem01, R.drawable.slidem02, R.drawable.slidem03,R.drawable.slidem04,R.drawable.slidem05,R.drawable.slidem06
            ,R.drawable.slidem07, R.drawable.slidem08, R.drawable.slidem09,R.drawable.slidem10,R.drawable.slidem11,R.drawable.slidem12,R.drawable.slidem13,R.drawable.slidem14, R.drawable.slidem15, R.drawable.slidem16,R.drawable.slidem17,R.drawable.slidem18,R.drawable.slidem19
            , R.drawable.slidem20, R.drawable.slidem21,R.drawable.slidem22,R.drawable.slidem23,R.drawable.slidem24)
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biology_module04)

        val imgSwitcher = findViewById<ImageSwitcher>(R.id.module04imageSwitcher)

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