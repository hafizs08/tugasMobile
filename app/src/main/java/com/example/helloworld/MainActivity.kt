package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //hello.text = "Hello Kotlin"
        Log.w(TAG,"My Log Message")

    }
    companion object {
        val TAG:String = MainActivity::class.java.simpleName
    }
}