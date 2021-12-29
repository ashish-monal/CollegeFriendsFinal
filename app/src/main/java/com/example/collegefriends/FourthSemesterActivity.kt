package com.example.collegefriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourthSemesterActivity : AppCompatActivity() {

    lateinit var btnDiscreateMathematics : Button
    lateinit var btnComputerOrganization : Button
    lateinit var btnOperatingSystem :Button
    lateinit var btnDesignAndAnalysis :Button
    lateinit var btnDigitalElectronics :Button
    lateinit var btnHumanResource :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_semester)

        btnDiscreateMathematics = findViewById(R.id.Semester4DMath)
        btnDiscreateMathematics.setOnClickListener {
            val intentDm = Intent(this@FourthSemesterActivity,Semester4DMathActivity::class.java)
            startActivity(intentDm)
        }

        btnComputerOrganization = findViewById(R.id.Semester4COA)
        btnComputerOrganization.setOnClickListener {
            val intentCOA = Intent(this@FourthSemesterActivity,Semester4CoaActivity::class.java)
            startActivity(intentCOA)
        }

        btnOperatingSystem = findViewById(R.id.Semester4OperatingSystem)
        btnOperatingSystem.setOnClickListener {
            val intentOS = Intent(this@FourthSemesterActivity,Semester4OperatingSystemActivity::class.java)
            startActivity(intentOS)
        }

        btnDesignAndAnalysis = findViewById(R.id.Semester4DAA)
        btnDesignAndAnalysis.setOnClickListener {
            val intentDAA = Intent(this@FourthSemesterActivity,Semester4DAaActivity::class.java)
            startActivity(intentDAA)
        }

        btnDigitalElectronics = findViewById(R.id.Semester4DigitalElectronics)
        btnDigitalElectronics.setOnClickListener {
            val intentDE = Intent(this@FourthSemesterActivity,Semester4DigitalElectronicActivity::class.java)
            startActivity(intentDE)
        }

        btnHumanResource = findViewById(R.id.Semester4HRD)
        btnHumanResource.setOnClickListener {
            val intentHRD = Intent(this@FourthSemesterActivity,Semester4HrdActivity::class.java)
            startActivity(intentHRD)
        }
    }

}