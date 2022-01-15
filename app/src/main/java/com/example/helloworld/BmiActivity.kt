package com.example.helloworld

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_bmi.*
import kotlinx.android.synthetic.main.activity_inputbmi.*

class BmiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)
//        var intentData = intent.data
        var intentExtra = intent
        hasilTinggi.text = "${intentExtra.getStringExtra(EXTRA_TINGGI)}"
        hasilBerat.text = "${intentExtra.getStringExtra(EXTRA_BERAT)}"
        result.text = "${intentExtra.getStringExtra(EXTRA_BMI)}"
    }
    fun onBmiButton(view: View) {
        finish()
    }
}