package com.example.collegefriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BiologyActivity : AppCompatActivity() {

    lateinit var btnBiologyModule01: Button
    lateinit var btnBiologyModule02: Button
    lateinit var btnBiologyModule03: Button
    lateinit var btnBiologyModule04: Button
    lateinit var btnBiologyModule05: Button
    lateinit var btnBiologyModule06: Button
    lateinit var btnBiologyModule07: Button
    lateinit var btnBiologyModule08: Button
    lateinit var btnBiologyModule09: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biology)

        btnBiologyModule01 = findViewById(R.id.BiologyIntroduction)
        btnBiologyModule01.setOnClickListener {
            val intentModule01 = Intent(this@BiologyActivity, BilogyModule01Activity::class.java)
            startActivity(intentModule01)
        }
        btnBiologyModule02 = findViewById(R.id.BiologyClassification)
        btnBiologyModule02.setOnClickListener {
            val intentModule02 = Intent(this@BiologyActivity, BilogyModule02Activity::class.java)
            startActivity(intentModule02)
        }
        btnBiologyModule03 = findViewById(R.id.BiologyGenetics)
        btnBiologyModule03.setOnClickListener {
            val intentModule03 = Intent(this@BiologyActivity, BiologyModule03Activity::class.java)
            startActivity(intentModule03)
        }
        btnBiologyModule04 = findViewById(R.id.BiologyBiomolecules)
        btnBiologyModule04.setOnClickListener {
            val intentModule04 = Intent(this@BiologyActivity, BiologyModule04Activity::class.java)
            startActivity(intentModule04)
        }
        btnBiologyModule05 = findViewById(R.id.BiologyEnzymes)
        btnBiologyModule05.setOnClickListener {
            val intentModule05 = Intent(this@BiologyActivity, BiologyModule05Activity::class.java)
            startActivity(intentModule05)
        }
        btnBiologyModule06 = findViewById(R.id.BiologyInformationTransfer)
        btnBiologyModule06.setOnClickListener {
            val intentModule06 = Intent(this@BiologyActivity, BiologyModule06Activity::class.java)
            startActivity(intentModule06)
        }
        btnBiologyModule07 = findViewById(R.id.BiologyMacroMolecules)
        btnBiologyModule07.setOnClickListener {
            val intentModule07 = Intent(this@BiologyActivity, BiologyModule07Activity::class.java)
            startActivity(intentModule07)
        }
        btnBiologyModule08 = findViewById(R.id.BiologyMetabolism)
        btnBiologyModule08.setOnClickListener {
            val intentModule08 = Intent(this@BiologyActivity, BiologyModule08Activity::class.java)
            startActivity(intentModule08)
        }
        btnBiologyModule09 = findViewById(R.id.BiologyMicrobiology)
        btnBiologyModule09.setOnClickListener {
            val intentModule09 = Intent(this@BiologyActivity, BiologyModule09Activity::class.java)
            startActivity(intentModule09)
        }
    }
}