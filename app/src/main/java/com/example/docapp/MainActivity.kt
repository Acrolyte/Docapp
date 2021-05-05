package com.example.docapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.docapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainLoginButton.setOnClickListener() {
            intent = Intent(this, mainscreen::class.java)
            startActivity(intent)
            finish()
        }
        binding.textclickable.setOnClickListener(){
            intent = Intent(this, createacc::class.java)
            startActivity(intent)
            finish()
        }
    }
}