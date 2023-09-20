package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {
    var btnSwitch:MaterialButton?=null
    var btnShare:MaterialButton?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnShare = findViewById(R.id.btnShare)
        btnSwitch = findViewById(R.id.btnSwitch)

        //Intent Explicit
        btnSwitch!!.setOnClickListener{
            //panggil object intent memiliki 2 parameter
            //parameter pertama isi dengan context this (lokasi activty awal)
            //parameter kedua isi dengan class activity yang dituju
            val intent=Intent(this,DetailActivity::class.java)
            //jalankan activity
            startActivity(intent)
        }

        //Intent Implicit
        btnShare!!.setOnClickListener{
            //pilih action untuk mengirim pesan/message
            val intent=Intent(Intent.ACTION_SEND)
            //kirim pesan yang mau di share
            intent.putExtra(Intent.EXTRA_TEXT,"Hi There!! Watch this!!")
            intent.setType("text/plain")
            //Jalankan activity dengan data yang kita kirim
            startActivity(Intent.createChooser(intent,"Share to:"))
        }
    }
}