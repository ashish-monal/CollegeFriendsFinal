package com.example.collegefriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ComputerNetworkActivity : AppCompatActivity() {

    lateinit var  btnComputerNetworkModule01 : Button
    lateinit var btnComputerNetworkModule02 : Button
    lateinit var btnComputerNetworkModule03 : Button
    lateinit var btnComputerNetworkModule04 : Button
    lateinit var btnComputerNetworkModule05 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_computer_network)

        btnComputerNetworkModule01 = findViewById(R.id.ComputerNetworkDataCommunicationComponent)
        btnComputerNetworkModule01.setOnClickListener {
            val intentModule01 = Intent (this@ComputerNetworkActivity,ComputerNetworkModule01Avtivity::class.java)
            startActivity(intentModule01)
        }
        btnComputerNetworkModule02 = findViewById(R.id.ComputerNetworkDataLink)
        btnComputerNetworkModule02.setOnClickListener {
            val intentModule02 = Intent (this@ComputerNetworkActivity,ComputerNetworkModule02Activity::class.java)
            startActivity(intentModule02)
        }
        btnComputerNetworkModule03 = findViewById(R.id.ComputerNetworkNetworkLayer)
        btnComputerNetworkModule03.setOnClickListener {
            val intentModule03 = Intent (this@ComputerNetworkActivity,ComputerNetworkModule03Activity::class.java)
            startActivity(intentModule03)
        }
        btnComputerNetworkModule04 = findViewById(R.id.ComputerNetworkTransportNetwork)
        btnComputerNetworkModule04.setOnClickListener {
            val intentModule04 = Intent (this@ComputerNetworkActivity,ComputerNetworkModule04Activity::class.java)
            startActivity(intentModule04)
        }
        btnComputerNetworkModule05 = findViewById(R.id.ComputerNetworkApplicationLayer)
        btnComputerNetworkModule05.setOnClickListener {
            val intentModule05 = Intent (this@ComputerNetworkActivity,ComputerNetworkModule05Activity::class.java)
            startActivity(intentModule05)
        }
    }
}