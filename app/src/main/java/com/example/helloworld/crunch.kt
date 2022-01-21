package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class crunch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crunch)
    }
    fun next(view: View){
        var intentReply = Intent(this, pendaki::class.java)
        startActivity(intentReply)
    }
    fun kembali(view: View){
        finish()
    }
}