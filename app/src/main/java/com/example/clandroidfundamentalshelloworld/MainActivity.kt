package com.example.clandroidfundamentalshelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MAINLOGTAG, "Hello World")
    }

    companion object{
        const val MAINLOGTAG = "MainActivity"
    }
}