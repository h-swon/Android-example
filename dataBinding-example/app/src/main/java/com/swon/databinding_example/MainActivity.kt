package com.swon.databinding_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import com.swon.databinding_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.user = User(ObservableField("sungwon"), ObservableInt(20))
        binding.myText = "Hello"

        binding.userNameText.setOnClickListener {
            binding.user?.name?.set("clicked")
        }
    }
}