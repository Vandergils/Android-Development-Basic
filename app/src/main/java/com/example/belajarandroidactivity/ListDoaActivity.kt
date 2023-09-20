package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.model.Doa

class ListDoaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_doa)
        val rvDoa:RecyclerView=findViewById(R.id.rvDoa)
        val data= arrayListOf<Doa>(
            Doa("Dzikir dan Doa Sunnah Setelah Sholat",R.drawable.doa_harian2),
            Doa("Dzikir Setiap Saat",R.drawable.doa_harian2),
            Doa("Doa Sehari Hari",R.drawable.doa_harian2),
            Doa("Doa Sebelum Melakukan Sesuatu",R.drawable.doa_harian2),
            Doa("Doa Sholat Taubah",R.drawable.doa_harian2),
            Doa("Doa Sholat Tahajud",R.drawable.doa_harian2)
        )
        val adapter=DoaAdapter(data)
        rvDoa.adapter=adapter
        rvDoa.layoutManager=
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)

        val cvSelengkapnya:CardView=findViewById(R.id.cvSelengkapnya)
        cvSelengkapnya.setOnClickListener{
            val intent=
                Intent(this,DoaHarianActivity::class.java)
            startActivity(intent)
        }


    }
}