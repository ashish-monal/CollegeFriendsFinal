package com.example.collegefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView

class BiologyModule08Activity : AppCompatActivity() {

    private val image8 = intArrayOf(R.drawable.slide124, R.drawable.slide125, R.drawable.slide126,R.drawable.slide127,R.drawable.slide128,R.drawable.slide129
            ,R.drawable.slide130, R.drawable.slide131, R.drawable.slide132,R.drawable.slide133, R.drawable.slide134, R.drawable.slide135,R.drawable.slide136,R.drawable.slide137, R.drawable.slide138, R.drawable.slide139,R.drawable.slide140,R.drawable.slide141,R.drawable.slide142
            ,R.drawable.slide142, R.drawable.slide143, R.drawable.slide144,R.drawable.slide145, R.drawable.slide146,R.drawable.slide147, R.drawable.slide148, R.drawable.slide149,R.drawable.slide150,R.drawable.slide151,R.drawable.slide152)
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biology_module08)

        val imgSwitcher = findViewById<ImageSwitcher>(R.id.module08imageSwitcher)

        imgSwitcher?.setFactory {
            val imgView = ImageView(applicationContext)
            imgView.scaleType = ImageView.ScaleType.FIT_CENTER
            imgView.setPadding(8, 8, 8, 8)
            imgView
        }

        imgSwitcher?.setImageResource(image8[index])

        val imgIn = AnimationUtils.loadAnimation(
                this, android.R.anim.slide_in_left)
        imgSwitcher?.inAnimation = imgIn

        val imgOut = AnimationUtils.loadAnimation(
                this, android.R.anim.slide_out_right)
        imgSwitcher?.outAnimation = imgOut

        val prev = findViewById<Button>(R.id.previous)
        prev.setOnClickListener {
            index = if (index - 1 >= 0) index - 1 else 2
            imgSwitcher?.setImageResource(image8[index])
        }
        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener {
            index = if (index + 1 < image8.size) index + 1 else 0
            imgSwitcher?.setImageResource(image8[index])
        }
    }
}