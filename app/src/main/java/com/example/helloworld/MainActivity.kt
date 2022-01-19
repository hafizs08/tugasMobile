package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onBmiButton(view: View) {
        var intentReply = Intent(this, Inputbmi::class.java)
        startActivity(intentReply)
    }

    fun onHistoryButton(view: View) {
        var intentReply = Intent(this, MainActivity2::class.java)
        startActivity(intentReply)
    }
}