package com.example.collegefriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondSemesterActivity : AppCompatActivity() {

    lateinit var btnBee: Button
    lateinit var btnEdg: Button
    lateinit var btnMath: Button
    lateinit var btnPhysics: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_semester)


        btnBee = findViewById(R.id.semester2BEE)
        btnBee.setOnClickListener {
            val intentBee = Intent(this@SecondSemesterActivity, Semester2BeeActivity::class.java)
            startActivity(intentBee)
        }
        btnEdg = findViewById(R.id.semester2EDG)
        btnEdg.setOnClickListener {
            val intentEdg = Intent(this@SecondSemesterActivity, Semester2EdgActivity::class.java)
            startActivity(intentEdg)
        }
        btnMath = findViewById(R.id.semester2Math2)
        btnMath.setOnClickListener {
            val intentMath = Intent(this@SecondSemesterActivity, Semester2Math2Activity::class.java)
            startActivity(intentMath)
        }
        btnPhysics = findViewById(R.id.semester2Physics)
        btnPhysics.setOnClickListener {
            val intentPhysics = Intent(this@SecondSemesterActivity, Semester2PhysicsActivity::class.java)
            startActivity(intentPhysics)
        }
    }
}