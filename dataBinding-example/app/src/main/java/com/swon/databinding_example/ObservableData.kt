package com.swon.databinding_example

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class ObservableData : BaseObservable() {

    @get:Bindable
    var name: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }
}



