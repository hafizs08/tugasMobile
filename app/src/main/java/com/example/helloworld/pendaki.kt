package com.example.helloworld

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class pendaki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pendaki)
    }
    fun finish(view: View){
        var intentReply = Intent(this, finish::class.java)
        startActivity(intentReply)
    }

    fun kembali(view: View){
        finish()
    }
}