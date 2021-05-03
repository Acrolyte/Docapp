package com.example.docapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.docapp.databinding.ActivityMainscreenBinding

class mainscreen : AppCompatActivity() {
    private lateinit var binding: ActivityMainscreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pro1.setOnClickListener {
            intent = Intent(this, subscreen::class.java)
            startActivity(intent)
        }
    }
}