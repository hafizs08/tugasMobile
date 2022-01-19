package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_water_intake.*

class WaterIntake : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_water_intake)
    }


    fun onBa(view: View) {
        var total = minum.text.toString().toDouble()
        minum.setText("${total + 6}")
        var baik = ideal.text.toString().toDouble()
        var goals = target.text.toString().toDouble()

        if (minum.text.toString().toDouble() <= ideal.text.toString().toFloat() && sisa.text.toString().toDouble() >= 6) {
            sisa.setText("${goals - minum.text.toString().toDouble()}")
        }
        else{
            sisa.setText("${0}")
        }
    }

    fun onBb(view: View) {
        var total = minum.text.toString().toDouble()
        minum.setText("${total + 12}")
        var baik = ideal.text.toString().toDouble()
        var goals = target.text.toString().toDouble()

        if (minum.text.toString().toDouble() <= ideal.text.toString().toFloat() && sisa.text.toString().toDouble() >= 6) {
            sisa.setText("${goals - minum.text.toString().toDouble()}")
        }
        else{
            sisa.setText("${0}")
        }
    }

    fun onBc(view: View) {
        var total = minum.text.toString().toDouble()
        minum.setText("${total + 18}")
        var baik = ideal.text.toString().toDouble()
        var goals = target.text.toString().toDouble()

        if (minum.text.toString().toDouble() <= ideal.text.toString().toFloat() && sisa.text.toString().toDouble() >= 6) {
            sisa.setText("${goals - minum.text.toString().toDouble()}")
        }
        else{
            sisa.setText("${0}")
        }
    }

    fun onBd(view: View) {
        var total = minum.text.toString().toDouble()
        minum.setText("${total + 24}")
        var baik = ideal.text.toString().toDouble()
        var goals = target.text.toString().toDouble()

        if (minum.text.toString().toDouble() <= ideal.text.toString().toFloat() && sisa.text.toString().toDouble() >= 6) {
            sisa.setText("${goals - minum.text.toString().toDouble()}")
        }
        else{
            sisa.setText("${0}")
        }
    }
}