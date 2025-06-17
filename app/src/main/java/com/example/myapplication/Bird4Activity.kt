package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Bird4Activity : AppCompatActivity() {
    lateinit var btnPrev4:ImageView
    lateinit var btnNext4:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bird4)
        btnPrev4=findViewById(R.id.btnPrev4)
        btnNext4=findViewById(R.id.btnNext4)
        btnPrev4.setOnClickListener{
           finish()
        }
        btnNext4.setOnClickListener{
            val intent= Intent(this,Bird5Activity::class.java)
            startActivity(intent)
        }
    }
}