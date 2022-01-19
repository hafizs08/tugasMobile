package com.example.helloworld

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_bmi.*
import kotlinx.android.synthetic.main.activity_inputbmi.*
import kotlin.math.pow

class Inputbmi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inputbmi)
    }

    fun onBmiButton(view: View) {
        if (inputTinggi.text.toString().length == 0) {
            inputTinggi.setText("0");
        }

        var inputTg = inputTinggi.text.toString()
        var inputBr = inputBerat.text.toString()

        var weightValue = 0.0
        var heightValue = 0.0
        if (inputBerat.text.toString().isNotEmpty()) {
            weightValue = inputBerat.text.toString().toDouble()
        }
        if (inputTinggi.text.toString().isNotEmpty()) {
            heightValue = (inputTinggi.text.toString().toDouble() / 100)
        }

        val bmiValue = String.format("%.2f", weightValue / heightValue.pow(2))
        var bmiHasil = bmiValue.toString()

        var intentReply = Intent(this, BmiActivity::class.java)
        intentReply.setData(Uri.parse("custom://$inputTg"))
//        intentReply.setData(Uri.parse(inputTg))
//        intentReply.setData(Uri.parse(inputBr))
        intentReply.putExtra(EXTRA_TINGGI, inputTg)
        intentReply.putExtra(EXTRA_BERAT, inputBr)
        intentReply.putExtra(EXTRA_BMI, bmiHasil)

        startActivity(intentReply)
    }
}