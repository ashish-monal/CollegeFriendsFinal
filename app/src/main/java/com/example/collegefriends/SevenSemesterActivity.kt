package com.example.collegefriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SevenSemesterActivity : AppCompatActivity() {

    lateinit var btnBiology: Button
    lateinit var btnSoftSkills: Button
    lateinit var btnDataScience: Button
    lateinit var btnCyberSecurity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven_semester)

        btnBiology = findViewById(R.id.Biology)
        btnBiology.setOnClickListener {
            val intentBiology = Intent(this@SevenSemesterActivity, BiologyActivity::class.java)
            startActivity(intentBiology)
        }
        btnSoftSkills = findViewById(R.id.Softskill)
        btnSoftSkills.setOnClickListener {
            val intentSoftskills = Intent(this@SevenSemesterActivity, SoftSkillActivity::class.java)
            startActivity(intentSoftskills)
        }
        btnDataScience = findViewById(R.id.DataScience)
        btnDataScience.setOnClickListener {
            val intentDataScience = Intent(this@SevenSemesterActivity, DataScienceActivity::class.java)
            startActivity(intentDataScience)
        }
        btnCyberSecurity = findViewById(R.id.CyberSecurity)
        btnCyberSecurity.setOnClickListener {
            val intentCyberSecurity = Intent(this@SevenSemesterActivity, CyberSecurityActivity::class.java)
            startActivity(intentCyberSecurity)
        }
    }
}