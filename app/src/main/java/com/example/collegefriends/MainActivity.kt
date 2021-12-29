package com.example.collegefriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnSemester6: Button
    lateinit var btnSemester7: Button
    lateinit var btnSemester8: Button
    lateinit var btnSemester1: Button
    lateinit var btnSemester2: Button
    lateinit var btnSemester3: Button
    lateinit var btnSemester4: Button
    lateinit var btnSemester5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSemester6 = findViewById(R.id.semestersix)
        btnSemester6.setOnClickListener {
            val intent = Intent(this@MainActivity, SixSemesterActivity::class.java)
            startActivity(intent)
        }
        btnSemester7 = findViewById(R.id.semesterseven)
        btnSemester7.setOnClickListener {
            val intentsevensemester = Intent(this@MainActivity, SevenSemesterActivity::class.java)
            startActivity(intentsevensemester)
        }
        btnSemester8 = findViewById(R.id.semestereight)
        btnSemester8.setOnClickListener {
            val intentEightSemester = Intent(this@MainActivity, EightSemesterActivity::class.java)
            startActivity(intentEightSemester)
        }
        btnSemester1 = findViewById(R.id.semesterfirst)
        btnSemester1.setOnClickListener {
            val intentFirst = Intent(this@MainActivity, FirstSemesterActivity::class.java)
            startActivity(intentFirst)
        }
        btnSemester2 = findViewById(R.id.semestersecond)
        btnSemester2.setOnClickListener {
            val intentSecond = Intent(this@MainActivity, SecondSemesterActivity::class.java)
            startActivity(intentSecond)
        }
        btnSemester3 = findViewById(R.id.semesterthird)
        btnSemester3.setOnClickListener {
            val intentThird = Intent(this@MainActivity, ThirdSemesterActivity::class.java)
            startActivity(intentThird)
        }
        btnSemester4 = findViewById(R.id.semesterfour)
        btnSemester4.setOnClickListener {
            val intentFour = Intent(this@MainActivity, FourthSemesterActivity::class.java)
            startActivity(intentFour)
        }
        btnSemester5 = findViewById(R.id.semesterfive)
        btnSemester5.setOnClickListener {
            val intentFive= Intent(this@MainActivity,FiftSemesterActivity::class.java)
            startActivity(intentFive)
        }
    }
}