package com.example.casttttv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.casttttv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.titleText.text = getString(R.string.hello_message)
        binding.actionButton.setOnClickListener {
            binding.titleText.text = getString(R.string.clicked_message)
        }
    }
}
