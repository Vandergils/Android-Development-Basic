package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.Language

class ListPemrogramanActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemrograman)
        val rvBahasaPemrograman:RecyclerView=findViewById(R.id.rvBahasaPemrograman)
        val data= arrayListOf<Language>(
            Language("Golang",R.drawable.golang),
            Language("C++",R.drawable.cplus),
            Language("Pyhton",R.drawable.python),
            Language("Golang",R.drawable.golang),
            Language("C++",R.drawable.cplus),
            Language("Pyhton",R.drawable.python),
        )
        val adapter=LanguageAdapter(data)
//        gunakan adapter kita pada recylce view
        rvBahasaPemrograman.adapter=adapter
//        atur layout agar vertical
        rvBahasaPemrograman.layoutManager=
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)
    }
}