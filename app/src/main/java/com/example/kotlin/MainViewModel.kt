package com.example.kotlin

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel(application: Application, private val text: String) : AndroidViewModel(application) {

    val myLiveData = MyLiveData()

    init {
        start()
    }

    private fun start() {
        Toast.makeText(getApplication(), text, Toast.LENGTH_LONG).show()
    }
}