package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var btnNext1:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnNext1=findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener{
            val intent= Intent(this,Bird2Activity::class.java)
            startActivity(intent)
        }

    }
}


//R reperesents module
//Intent used for opening communicate between different in an app
//this referrences for the current activity
//
//drawable is equivalent to te image folder
//layout is
//package name for popular app com.name of app.android
//R.layout
//mipmap=app -launched app icons
//vector--
//Raster
//res=resources
//values
//colors.xml---for explaining/defining app colors
//Strings----static texts in our app if we have color placed in many ways to change only ones
//light mode and dark mode
//versionCode==is a number starts from 1 and it is a version of an app always increasing
//versionName==  is a human readable version and it is also optional
//


