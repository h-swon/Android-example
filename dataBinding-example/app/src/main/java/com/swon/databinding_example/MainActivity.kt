package com.swon.databinding_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.*
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

        // Observable 컬렉션 사용
        val student = ObservableArrayMap<String, Any>()
        student["name"] = "sungwon"
        student["age"] = 29
        binding.student = student

        val student2 = ObservableArrayList<Any>()
        student2.add(3)
        student2.add("sungwon")
        binding.student2 = student2
    }
}