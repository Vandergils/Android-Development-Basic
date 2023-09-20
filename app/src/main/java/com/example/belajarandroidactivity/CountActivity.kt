package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class CountActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val numberOne:TextView=findViewById(R.id.NumberOne)
        val buttonPlus:Button=findViewById(R.id.ButtonPlus)
        val buttonMinus:Button=findViewById(R.id.ButtonMin)
        val buttonReset:Button=findViewById(R.id.ButtonReset)
        //setText=merubah mengisih text
        println(numberOne.text)

        Log.d("Number","onCreate:${numberOne}")
        buttonPlus.setOnClickListener{
            var countInteger:Int=numberOne.text.toString().toInt()
            countInteger++

            numberOne.text=countInteger.toString()
        }
        buttonMinus.setOnClickListener{
            var minInteger:Int=numberOne.text.toString().toInt()
            minInteger--

            numberOne.text=minInteger.toString()
        }
        buttonReset.setOnClickListener{
            var resetInteger:Int=numberOne.text.toString().toInt()
            resetInteger=0

            numberOne.text=resetInteger.toString()
        }
    }
}