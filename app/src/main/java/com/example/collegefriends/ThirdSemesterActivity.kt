package com.example.collegefriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdSemesterActivity : AppCompatActivity() {

    lateinit var btnDSA: Button
    lateinit var btnOPPs : Button
    lateinit var btnMath3 : Button
    lateinit var btnTW : Button
    lateinit var btnAnalog :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_semester)

        btnDSA = findViewById(R.id.Semester3DSA)
        btnDSA.setOnClickListener {
            val intentDSA = Intent(this@ThirdSemesterActivity,Semester3DsaActivity::class.java)
            startActivity(intentDSA)
        }
        btnOPPs = findViewById(R.id.Semester3OOps)
        btnOPPs.setOnClickListener {
            val intentOpps = Intent(this@ThirdSemesterActivity,Semseter3OopActivity::class.java)
            startActivity(intentOpps)
        }
        btnMath3 = findViewById(R.id.Semester3Math)
        btnMath3.setOnClickListener {
            val intentMath3 = Intent(this@ThirdSemesterActivity,Semester3Math3Activity::class.java)
            startActivity(intentMath3)
        }
        btnTW = findViewById(R.id.Semester3TW)
        btnTW.setOnClickListener {
            val intentTW = Intent(this@ThirdSemesterActivity,Semester3TechnicalWritingActivity::class.java)
            startActivity(intentTW)
        }
        btnAnalog = findViewById(R.id.Semester3Analog)
        btnAnalog.setOnClickListener {
            val intentAnalog = Intent (this@ThirdSemesterActivity,Semester3AnalogActivity::class.java)
            startActivity(intentAnalog)
        }
    }
}