package com.example.assignment4navigation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PageAActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_aactivity)

        val btnGoToB = findViewById<Button>(R.id.btnGoToB)
        btnGoToB.setOnClickListener {
            val intent = Intent(this, PageBActivity::class.java)
            startActivity(intent)
        }
    }
}