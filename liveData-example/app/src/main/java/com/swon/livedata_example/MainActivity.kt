package com.swon.livedata_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.MutableLiveData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.text)

        val liveString = MutableLiveData<Int>()
        liveString.postValue(1)
        liveString.postValue(2)
        liveString.postValue(3)
        liveString.postValue(4)
        liveString.value = 5
        liveString.postValue(6)
        liveString.postValue(7)
        liveString.postValue(8)
        liveString.postValue(9)
        // postValue()는 가장 마지막에 호출한 값만 가져온다.

        liveString.observe(this) {
            Log.d(this.toString(), it.toString())
            textView.text = it.toString()
        }

        textView.setOnClickListener {
            liveString.postValue(liveString.value?.plus(1))
        }
    }
}