package com.example.collegefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView

class CyberSecurityActivity : AppCompatActivity() {

    private val image = intArrayOf(R.drawable.cs01, R.drawable.cs02, R.drawable.cs03, R.drawable.cs04, R.drawable.cs05, R.drawable.cs06, R.drawable.cs07, R.drawable.cs08, R.drawable.cs09, R.drawable.csa10, R.drawable.csa11, R.drawable.csa12, R.drawable.csa13, R.drawable.csa14, R.drawable.csa15, R.drawable.csa16, R.drawable.csa17, R.drawable.csa18, R.drawable.csa19, R.drawable.cs020, R.drawable.cs21, R.drawable.cs22, R.drawable.cs23, R.drawable.cs24, R.drawable.cs25, R.drawable.cs26, R.drawable.cs27, R.drawable.cs28)
    private var index = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cyber_security)

        val imgSwitcher = findViewById<ImageSwitcher>(R.id.CyberSecurityImageSwitcher)

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