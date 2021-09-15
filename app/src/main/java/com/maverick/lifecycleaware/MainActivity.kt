package com.maverick.lifecycleaware

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(Observer())
        Log.d("MAIN","Main onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN","Main onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN","Main onPause")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MAIN","Main onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAIN","Main omStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAIN","Main onDestroy")
    }

}