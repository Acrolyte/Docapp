package com.example.docapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class createacc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createacc)

        val text : TextView = findViewById(R.id.textclickable2)
        text.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}