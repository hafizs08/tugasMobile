package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class finish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
    }
    fun repeat(view: View){
        var intentReply = Intent(this, Olahraga::class.java)
        startActivity(intentReply)
    }
    fun selesai(view: View){
        var intentReply = Intent(this, MainActivity::class.java)
        startActivity(intentReply)
    }
}