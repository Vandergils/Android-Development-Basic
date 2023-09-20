package com.example.belajarandroidactivity

import android.graphics.BlurMaskFilter.Blur
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation

class BelajarScrollViewActivity : AppCompatActivity() {
    var iVbackgrounds :ImageView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll_view)

        iVbackgrounds = findViewById(R.id.iVbackgrounds)

        Glide.with(this)
            .load(R.drawable.banner)
            .transform(BlurTransformation(23,3))
            .into(iVbackgrounds!!)
    }
}