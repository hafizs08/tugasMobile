package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_makanbang.*

class makanbang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanbang)

        val adapter = ArrayAdapter.createFromResource(this, R.array.item_makanan, android.R.layout.simple_spinner_dropdown_item)
        jenisMakanan.adapter = adapter
    }
    fun onSaveMakan(view: View) {

    }
}