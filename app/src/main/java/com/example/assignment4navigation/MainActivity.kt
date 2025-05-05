package com.example.assignment4navigation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGoToA = findViewById<Button>(R.id.btnGoToA)
        val btnGoToX = findViewById<Button>(R.id.btnGoToX)

        btnGoToA.setOnClickListener {
            val intent = Intent(this, PageAActivity::class.java)
            startActivity(intent)
        }

        btnGoToX.setOnClickListener {
            val intent = Intent(this, PageXActivity::class.java)
            startActivity(intent)
        }
    }
}