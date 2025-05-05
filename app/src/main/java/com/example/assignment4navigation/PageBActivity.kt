package com.example.assignment4navigation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PageBActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_bactivity)

        val btnGoToY = findViewById<Button>(R.id.btnGoToY)
        btnGoToY.setOnClickListener {
            val intent = Intent(this, PageYActivity::class.java)
            startActivity(intent)
        }
    }
}