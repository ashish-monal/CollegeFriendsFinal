package com.example.collegefriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CompilerDesignActivity : AppCompatActivity() {

    lateinit var btnCompilerDesignIntroduction: Button
    lateinit var btnCompilerDesignSyntaxAnalysisParser: Button
    lateinit var btnCompilerDesignSementicAnalysis: Button
    lateinit var btnCompilerDesignIntermediateCodeGeneration: Button
    lateinit var btnCompilerDesignAdvanceTopic: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compiler_design)

        btnCompilerDesignIntroduction = findViewById(R.id.CompilerDesignIntroduction)
        btnCompilerDesignIntroduction.setOnClickListener {
            val intentFirst = Intent(this@CompilerDesignActivity, CompilerDesignIntroductionActivity::class.java)
            startActivity(intentFirst)
        }
        btnCompilerDesignSyntaxAnalysisParser = findViewById(R.id.CompilerDesignSyntaxAnalysis)
        btnCompilerDesignSyntaxAnalysisParser.setOnClickListener {
            val intentSecond = Intent(this@CompilerDesignActivity, CompilerDesignSyntaxAnalysisParser::class.java)
            startActivity(intentSecond)
        }
        btnCompilerDesignSementicAnalysis = findViewById(R.id.CompilerDesignSementicAnalysis)
        btnCompilerDesignSementicAnalysis.setOnClickListener {
            val intentthird = Intent(this@CompilerDesignActivity, CompilerDesignSementicAnalysisActivity::class.java)
            startActivity(intentthird)
        }
        btnCompilerDesignIntermediateCodeGeneration = findViewById(R.id.CompilerDesignIntermediateCodeGeneration)
        btnCompilerDesignIntermediateCodeGeneration.setOnClickListener {
            val intentfour = Intent(this@CompilerDesignActivity, CompilerDesignIntermediateCodeGenerationActivity::class.java)
            startActivity(intentfour)
        }
        btnCompilerDesignAdvanceTopic = findViewById(R.id.CompilerDesignAdvanceTopic)
        btnCompilerDesignAdvanceTopic.setOnClickListener {
            val intentFive = Intent(this@CompilerDesignActivity, CompilerDesignAdvanceTopicActivity::class.java)
            startActivity(intentFive)
        }
    }
}