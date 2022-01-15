package com.example.helloworld

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_bmi.*
import kotlinx.android.synthetic.main.activity_inputbmi.*

class Inputbmi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inputbmi)
    }
    fun onBmiButton(view: View) {
        var inputTg = inputTinggi.text.toString()
        var intentReply = Intent(this, BmiActivity::class.java)
        intentReply.setData(Uri.parse("custom://$inputTg"))
        startActivity(intentReply)
    }
}