package com.example.collegefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView

class Semester1ChemistryActivity : AppCompatActivity() {

    private val image = intArrayOf(R.raw.chemistry0004, R.raw.chemistry0005, R.raw.chemistry0006, R.raw.chemistry0004, R.raw.chemistry0005, R.raw.chemistry0006, R.raw.chemistry0007, R.raw.chemistry0008, R.raw.chemistry0009, R.raw.chemistry0010, R.raw.chemistry0011, R.raw.chemistry0012, R.raw.chemistry0013, R.raw.chemistry0014, R.raw.chemistry0015, R.raw.chemistry0016, R.raw.chemistry0017, R.raw.chemistry0018,
            R.raw.chemistry0019, R.raw.chemistry0020, R.raw.chemistry0021, R.raw.chemistry0021, R.raw.chemistry0022, R.raw.chemistry0023, R.raw.chemistry0024, R.raw.chemistry0025, R.raw.chemistry0026, R.raw.chemistry0027, R.raw.chemistry0028, R.raw.chemistry0029, R.raw.chemistry0030, R.raw.chemistry0031, R.raw.chemistry0032, R.raw.chemistry0033, R.raw.chemistry0034, R.raw.chemistry0035, R.raw.chemistry0036, R.raw.chemistry0037, R.raw.chemistry0038, R.raw.chemistry0039, R.raw.chemistry0040, R.raw.chemistry0041, R.raw.chemistry0042, R.raw.chemistry0043, R.raw.chemistry0044, R.raw.chemistry0045, R.raw.chemistry0046, R.raw.chemistry0047, R.raw.chemistry0048, R.raw.chemistry0049, R.raw.chemistry0050)
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_semester1_chemistry)

        val imgSwitcher = findViewById<ImageSwitcher>(R.id.ChemistryImageSwitcher)

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