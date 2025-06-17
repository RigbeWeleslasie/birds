package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Bird3Activity : AppCompatActivity() {
    lateinit var btnNext3:ImageView
    lateinit var btnPrev3:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bird3)
        btnPrev3=findViewById(R.id.btnPrev3)
        btnNext3=findViewById(R.id.btnNext3)
        btnPrev3.setOnClickListener{
           finish()
        }
        btnNext3.setOnClickListener{
            val intent= Intent(this,Bird4Activity::class.java)
            startActivity(intent)
        }

    }
}