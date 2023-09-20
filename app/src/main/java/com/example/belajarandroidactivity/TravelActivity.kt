package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity : AppCompatActivity() {

    var ibCall:ImageButton?= null
    var ibNavigate:ImageButton?= null
    var ibShare:ImageButton?= null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)
// isi menggunakan findById(R.id.(id))
        ibCall= findViewById(R.id.ibCall)
        ibNavigate= findViewById(R.id.ibNavigate)
        ibShare= findViewById(R.id.ibShare)

        ibCall!!.setOnClickListener{
// parameter Intent.ACTION_DIAL
            val phoneNumber="082110022909"
            val phoneIntent = Intent(Intent.ACTION_DIAL,
                Uri.parse("tel: $phoneNumber"))
            // jalankan intent
            startActivity(phoneIntent)
        }

        ibNavigate!!.setOnClickListener{
            val mapIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:46.546814248959095, 7.892916121495298")
            )
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
    }
}