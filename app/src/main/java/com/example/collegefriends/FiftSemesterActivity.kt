package com.example.collegefriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FiftSemesterActivity : AppCompatActivity() {


    lateinit var btnDBMS: Button
    lateinit var btnFLAT: Button
    lateinit var btnAI: Button
    lateinit var btnSE: Button
    lateinit var btnPSD: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fift_semester)

        btnAI = findViewById(R.id.Semester5AI)
        btnAI.setOnClickListener {
            val intentAI = Intent(this@FiftSemesterActivity,Semester5ArtificialActivity::class.java)
            startActivity(intentAI)
        }
        btnDBMS = findViewById(R.id.Semester5DBMS)
        btnDBMS.setOnClickListener {
            val intentDBMS = Intent(this@FiftSemesterActivity,Semester5DataBaseActivity::class.java)
            startActivity(intentDBMS)
        }
        btnFLAT = findViewById(R.id.Semester5FLAT)
        btnFLAT.setOnClickListener {
            val intentFLAT = Intent(this@FiftSemesterActivity,Semester5FormalLanguageActivity::class.java)
            startActivity(intentFLAT)
        }
        btnSE = findViewById(R.id.Semester5SE)
        btnSE.setOnClickListener {
            val intentSE = Intent(this@FiftSemesterActivity,Semester5SoftwareDevelopmentActivity::class.java)
            startActivity(intentSE)
        }
        btnPSD = findViewById(R.id.Semester5PSD)
        btnPSD.setOnClickListener {
            val intentPSD = Intent(this@FiftSemesterActivity,Semester5ProfessionalActivity::class.java)
            startActivity(intentPSD)
        }
    }
}