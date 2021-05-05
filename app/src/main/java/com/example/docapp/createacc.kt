package com.example.docapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.docapp.databinding.ActivityCreateaccBinding

class createacc : AppCompatActivity() {
    private lateinit var binding: ActivityCreateaccBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateaccBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textclickable2.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}