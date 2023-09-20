package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListNamaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)
//        define array adapter
        val arrayAdapter:ArrayAdapter<*>
        val users = arrayOf(
            "William Smith","Jocelyn Reaves","Marianne Djik"
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