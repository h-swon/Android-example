package com.swon.lifecycles_example

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner


class MyLifeCycleObserver : DefaultLifecycleObserver, LifecycleEventObserver {

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.d(owner.toString(), "onCreate")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d(owner.toString(), "onResume")
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when (event) {
            Lifecycle.Event.ON_CREATE -> {
                Log.d(source.toString(), "onCreateEvent")

            }
            Lifecycle.Event.ON_START -> {
                Log.d(source.toString(), "onStartEvent")
            }
            else -> {}
        }
    }
}