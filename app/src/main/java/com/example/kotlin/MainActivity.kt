package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.*

class MainActivity : AppCompatActivity() {

    private val getData = GetData() //цикл
    lateinit var observer: Observer<String>
    lateinit var viewModel: MainViewModel
    private var textFactory: String = "Factory"
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(getData)

        observer = Observer {
            text_view.text = it
        }

        viewModel = ViewModelProvider(this, MainFactory(application, textFactory))
            .get(MainViewModel::class.java)

        button_save.setOnClickListener {
            viewModel.myLiveData.setValueToLiveData(edit_text.text.toString())
        }
    }

    override fun onStart() {
        super.onStart()
        viewModel.myLiveData.observe(this, observer)
    }

    override fun onStop() {
        super.onStop()
        viewModel.myLiveData.removeObserver(observer)
        lifecycle.removeObserver(getData)

    }
}