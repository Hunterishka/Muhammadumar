package com.hunter.muhammadumar_project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hunter.muhammadumar_project.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}