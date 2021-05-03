package com.example.docapp

import android.content.Intent
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class mainscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainscreen)

        val t : RelativeLayout = findViewById(R.id.pro1)
        t.setOnClickListener {
            intent = Intent(this, subscreen::class.java)
            startActivity(intent)
        }
    }
}