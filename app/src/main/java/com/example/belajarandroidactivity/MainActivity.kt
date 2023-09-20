package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Input
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val JudulForm:TextView=findViewById(R.id.JudulForm)

        val LabelNama:TextView=findViewById(R.id.LabelNama)
        val InputNama:EditText=findViewById(R.id.InputNama)

        val LabelKelas:TextView=findViewById(R.id.LabelKelas)
        val InputKelas:EditText=findViewById(R.id.InputKelas)

        val LabelKode:TextView=findViewById(R.id.LabelKode)
        val InputKode:EditText=findViewById(R.id.InputKode)

        val SubButton:Button=findViewById(R.id.SubButton)
        var ShowNama:TextView=findViewById(R.id.ShowNama)
        var ShowKelas:TextView=findViewById(R.id.ShowKelas)
        var ShowBuku:TextView=findViewById(R.id.ShowBuku)



        SubButton.setOnClickListener{
            Toast.makeText(this,"Hello ${InputNama.text} Kamu Meminjam Buku ${ShowBuku.text}",Toast.LENGTH_SHORT)
                .show();
            ShowNama.text=InputNama.text
            ShowKelas.text=InputKelas.text
            ShowBuku.text= InputKode.text

            var KodeBuku=InputKode.text.toString()
            when(KodeBuku){
                    "123" -> ShowBuku.text ="Alice Wonderland"
                    "456" -> ShowBuku.text= "Harry Potter"
                    "789" -> ShowBuku.text= "Vindland"
                else -> ShowBuku.text= "Invalid"
            }


        }
    }
}