package com.example.kotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin.*
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

//    private val getData = GetData() //цикл
//    lateinit var observer: Observer<String>
//    lateinit var viewModel: MainViewModel
//    private var textFactory: String = "Factory"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_first, container, false)

    }

    override fun onStart() {
        super.onStart()
//        viewModel.myLiveData.observe(this, observer)
    }

    override fun onStop() {
        super.onStop()
//        viewModel.myLiveData.removeObserver(observer)
//        lifecycle.removeObserver(getData)
    }
}