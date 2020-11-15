package com.example.kotlin

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class GetData : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun getData() {
        print("Get")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun sendData() {
        print("Send")
    }


}