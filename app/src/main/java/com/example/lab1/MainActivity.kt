package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("PGB", "In onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i( "PGB",  "In onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i( "PGB", "In onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.i("PGB", "In onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("PGB", "In onDestroy")
    }
}

