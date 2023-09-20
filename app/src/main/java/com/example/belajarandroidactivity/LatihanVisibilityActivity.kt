package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LatihanVisibilityActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_visibility)
        val tvText: TextView = findViewById(R.id.tvText)
        val btnClick: Button = findViewById(R.id.btnClick)
//        event click
        btnClick.setOnClickListener {
            if (tvText.visibility == View.INVISIBLE) {
//            munculkan text set invisible menjadi visible
                tvText.visibility = View.VISIBLE
            }
            else{
                tvText.visibility = View.INVISIBLE
            }
        }
    }
}