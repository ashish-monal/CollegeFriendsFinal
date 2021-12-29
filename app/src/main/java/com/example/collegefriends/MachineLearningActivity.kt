package com.example.collegefriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MachineLearningActivity : AppCompatActivity() {

    lateinit var btnMachineLearningIntroduction: Button
    lateinit var btnMachineLearningStaticDecisionTheory: Button
    lateinit var btnMachineLearningLinearClassification: Button
    lateinit var btnMachineLearningHypothesisTesting: Button
    lateinit var btnMachineLearningExceptionMaximisation: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_machine_learning)

        btnMachineLearningIntroduction = findViewById(R.id.MachineIntroduction)
        btnMachineLearningIntroduction.setOnClickListener {
            val intentfirst = Intent(this@MachineLearningActivity, IntroductionMachineLearningActivity::class.java)
            startActivity(intentfirst)
        }
        btnMachineLearningStaticDecisionTheory = findViewById(R.id.MachineStaticDecisionTheory)
        btnMachineLearningStaticDecisionTheory.setOnClickListener {
            val intentSecond = Intent(this@MachineLearningActivity, MachineStaticDecisionTheory::class.java)
            startActivity(intentSecond)
        }
        btnMachineLearningLinearClassification = findViewById(R.id.MachineLinearClassification)
        btnMachineLearningLinearClassification.setOnClickListener {
            val intentThird = Intent(this@MachineLearningActivity, IntroductionMachineLearningActivity::class.java)
            startActivity(intentThird)
        }
        btnMachineLearningHypothesisTesting = findViewById(R.id.MachineHypothesis)
        btnMachineLearningHypothesisTesting.setOnClickListener {
            val intentFour = Intent(this@MachineLearningActivity, MachineLearningHypothesisTesting::class.java)
            startActivity(intentFour)
        }
        btnMachineLearningExceptionMaximisation = findViewById(R.id.MachineException)
        btnMachineLearningExceptionMaximisation.setOnClickListener {
            val intentFive = Intent(this@MachineLearningActivity, MachineLearningExpectationMaximisation::class.java)
            startActivity(intentFive)
        }
    }
}
