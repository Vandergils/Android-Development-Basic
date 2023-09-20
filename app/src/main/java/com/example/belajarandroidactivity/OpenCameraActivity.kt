package com.example.belajarandroidactivity

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageButton
import android.widget.ImageView
import java.nio.channels.InterruptedByTimeoutException

class OpenCameraActivity : AppCompatActivity() {

    //deklarasi variabel
    var ibCamera:ImageButton?=null
    var ivSample:ImageView?=null
    val pic_id = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_camera)
        // isi findbyid masing masing
        ibCamera=findViewById(R.id.ibcamera)
        ivSample=findViewById(R.id.ivsample)

        ibCamera!!.setOnClickListener{
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,pic_id)
        }
    }
    //function activity result
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //jika nilai requestCode = pic_id
        if(requestCode == pic_id){
            //ambil data gambar yang kita capture dan conver menjadi Bitmap
            val photo:Bitmap = data?.extras?.get("data") as Bitmap
            //tampilkan gambar tipe bitmap pada ImageView kita
            ivSample!!.setImageBitmap(photo)
        }
    }
}