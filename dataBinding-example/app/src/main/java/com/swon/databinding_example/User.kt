package com.swon.databinding_example

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

data class User(
    val name: ObservableField<String>,
    val age: ObservableInt
)
