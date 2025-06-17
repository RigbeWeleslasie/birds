package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Bird2Activity : AppCompatActivity() {
    lateinit var btnPrev2:ImageView
    lateinit var btnNext2:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bird2)
        btnPrev2=findViewById(R.id.btnPrev2)
        btnNext2=findViewById(R.id.btnNext2)
        btnPrev2.setOnClickListener{
           finish()
        }
        btnNext2.setOnClickListener{
            val intent=Intent(this,Bird3Activity::class.java)
            startActivity(intent)
        }

    }
}