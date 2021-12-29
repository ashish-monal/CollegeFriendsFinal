package com.example.collegefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView

class SoftSkillActivity : AppCompatActivity() {

    private val imageSoftSkill = intArrayOf(R.drawable.ss1, R.drawable.ss2, R.drawable.ss3,R.drawable.ss4,R.drawable.ss5,R.drawable.ss6
            ,R.drawable.ss7, R.drawable.ss8, R.drawable.ss9,R.drawable.ss10,R.drawable.ss11,R.drawable.ss12)
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soft_skill)


        val imgSwitcher = findViewById<ImageSwitcher>(R.id.SoftSkillImageSwitcher)

        imgSwitcher?.setFactory {
            val imgView = ImageView(applicationContext)
            imgView.scaleType = ImageView.ScaleType.FIT_CENTER
            imgView.setPadding(8, 8, 8, 8)
            imgView
        }

        imgSwitcher?.setImageResource(imageSoftSkill[index])

        val imgIn = AnimationUtils.loadAnimation(
                this, android.R.anim.slide_in_left)
        imgSwitcher?.inAnimation = imgIn

        val imgOut = AnimationUtils.loadAnimation(
                this, android.R.anim.slide_out_right)
        imgSwitcher?.outAnimation = imgOut

        val prev = findViewById<Button>(R.id.previous)
        prev.setOnClickListener {
            index = if (index - 1 >= 0) index - 1 else 2
            imgSwitcher?.setImageResource(imageSoftSkill[index])
        }
        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener {
            index = if (index + 1 < imageSoftSkill.size) index + 1 else 0
            imgSwitcher?.setImageResource(imageSoftSkill[index])
        }

    }
}