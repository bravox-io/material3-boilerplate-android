package com.nevesrafael.template

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nevesrafael.template.databinding.ActivityPatternBinding

lateinit var binding: ActivityPatternBinding

class PatternActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPatternBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}