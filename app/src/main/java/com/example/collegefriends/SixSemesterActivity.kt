package com.example.collegefriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SixSemesterActivity : AppCompatActivity() {

    lateinit var btnMachineLearning: Button
    lateinit var btnCompilerDesign: Button
    lateinit var btnCOmputerNetwork: Button
    lateinit var btnGraphTheory: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_semester)

        btnMachineLearning = findViewById(R.id.MachineLearning)
        btnMachineLearning.setOnClickListener {
            val intentMachineLearning = Intent(this@SixSemesterActivity, MachineLearningActivity::class.java)
            startActivity(intentMachineLearning)
        }
        btnCompilerDesign = findViewById(R.id.CompilerDesign)
        btnCompilerDesign.setOnClickListener {
            val intentCompilerDesign = Intent(this@SixSemesterActivity, CompilerDesignActivity::class.java)
            startActivity(intentCompilerDesign)
        }
        btnCOmputerNetwork = findViewById(R.id.ComputerNetwork)
        btnCOmputerNetwork.setOnClickListener {
            val intentComputerNetwork = Intent(this@SixSemesterActivity, ComputerNetworkActivity::class.java)
            startActivity(intentComputerNetwork)
        }

    }
}