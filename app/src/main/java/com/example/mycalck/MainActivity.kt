package com.example.mycalck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.mycalck.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val viewModel: CalckViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.counter.observe(this, Observer { value ->
            binding.counterTv.text = value.toString()
        })

        binding.incrementBtn.setOnClickListener {
            viewModel.incrementCounter()
        }

        binding.decrementBtn.setOnClickListener {
            viewModel.decrementCounter()
        }
    }
}