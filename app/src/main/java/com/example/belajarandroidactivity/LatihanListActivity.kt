package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class LatihanListActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Python","C#","C++","JavaScript","PHP","Swift","Java","Go","SQL","Ruby"
        )
//        declared listView Variable
        var mListView: ListView = findViewById(R.id.lVname)
//        call arrayAdapter object(this,layout_sample,data)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            users)
//        fill adapter
        mListView.adapter = arrayAdapter
    }
}