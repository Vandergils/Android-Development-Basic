package com.example.belajarandroidactivity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val gambar: ImageView = findViewById(R.id.Gambar)
        val judul: TextView = findViewById(R.id.Judul)
        val labelFirst: TextView = findViewById(R.id.LabelFirst)
        val labelSecond: TextView = findViewById(R.id.LabelSecond)

        var firstNum: EditText = findViewById(R.id.FirstNum)
        var secondNum: EditText = findViewById(R.id.SecondNum)
        var buttonPlus: Button = findViewById(R.id.ButtonPlus)
        var buttonMinus: Button = findViewById(R.id.ButtonMinus)
        var buttonPercent: Button = findViewById(R.id.ButtonPercent)
        var buttonTimes: Button = findViewById(R.id.ButtonTimes)
        var buttonDivided: Button = findViewById(R.id.ButtonDivided)
        var buttonReset: Button = findViewById(R.id.ButtonReset)
        var Hasil: TextView = findViewById(R.id.Total)

        val builder: AlertDialog.Builder = AlertDialog.Builder(this@CalculatorActivity)

        buttonPlus.setOnClickListener {
            var number1: Int = firstNum.text.toString().toInt()
            var number2: Int = secondNum.text.toString().toInt()
            var hasilTambah: Int = number1 + number2

            Hasil.setText(hasilTambah.toString())
        }
        buttonMinus.setOnClickListener {
            var number1: Int = firstNum.text.toString().toInt()
            var number2: Int = secondNum.text.toString().toInt()
            var hasilKurang: Int = number1 - number2

            Hasil.setText(hasilKurang.toString())
        }
        buttonTimes.setOnClickListener {
            var number1: Int = firstNum.text.toString().toInt()
            var number2: Int = secondNum.text.toString().toInt()
            var hasilKali: Int = number1 * number2

            Hasil.setText(hasilKali.toString())
        }
        buttonDivided.setOnClickListener {
            var number1: Float = firstNum.text.toString().toFloat()
            var number2: Float = secondNum.text.toString().toFloat()
            var hasilBagi: Float = number1 / number2

            Hasil.setText(hasilBagi.toString())
        }
        buttonPercent.setOnClickListener {
            var number1: Int = firstNum.text.toString().toInt()
            var number2: Int = secondNum.text.toString().toInt()
            var hasilPersen: Int = number1 % number2

            Hasil.setText(hasilPersen.toString())
        }
        buttonReset.setOnClickListener {
            var number1: Int = firstNum.text.toString().toInt()
            var number2: Int = secondNum.text.toString().toInt()

            builder.setTitle("Warning!")
            builder.setMessage("Do you want to reset?")
            builder.setCancelable(false)
            builder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->

                Hasil.setText("0")
                firstNum.setText("")
                secondNum.setText("")
            })
            builder.setIcon(R.drawable.baseline_info_24)
            builder.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which -> })

            val alertDialog: AlertDialog = builder.create()
            alertDialog.show()
        }
    }
}