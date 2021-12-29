package com.example.collegefriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstSemesterActivity : AppCompatActivity() {

    lateinit var btnEnglish: Button
    lateinit var btnChemistry: Button
    lateinit var btnProgramming: Button
    lateinit var btnWorkShop: Button
    lateinit var btnMath: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_semester)

        btnEnglish = findViewById(R.id.Semester1English)
        btnEnglish.setOnClickListener {
            val intentENglish = Intent(this@FirstSemesterActivity, EnglishSemester01Activity::class.java)
            startActivity(intentENglish)
        }
        btnMath = findViewById(R.id.SemesterMath)
        btnMath.setOnClickListener {
            val intentMath = Intent(this@FirstSemesterActivity, Semester1Math::class.java)
            startActivity(intentMath)
        }
        btnChemistry = findViewById(R.id.Semester1Chemistry)
        btnChemistry.setOnClickListener {
            val intentChemistry = Intent(this@FirstSemesterActivity, Semester1ChemistryActivity::class.java)
            startActivity(intentChemistry)
        }
        btnProgramming = findViewById(R.id.Semester1Programming)
        btnProgramming.setOnClickListener {
            val intentProgrammin = Intent(this@FirstSemesterActivity, Semester1ProgrammingActivity::class.java)
            startActivity(intentProgrammin)
        }
        btnWorkShop = findViewById(R.id.Semester1Workshop)
        btnWorkShop.setOnClickListener {
            val intentWorkshop = Intent(this@FirstSemesterActivity, Semester1WorkshopActivity::class.java)
            startActivity(intentWorkshop)
        }
    }
}