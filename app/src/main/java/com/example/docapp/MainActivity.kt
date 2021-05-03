package com.example.docapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text : TextView = findViewById(R.id.textclickable)
        val button : Button = findViewById(R.id.main_login_button)

        button.setOnClickListener() {
            intent = Intent(this, mainscreen::class.java)
            startActivity(intent)
        }
        text.setOnClickListener(){
            intent = Intent(this, createacc::class.java)
            startActivity(intent)
        }
    }
}