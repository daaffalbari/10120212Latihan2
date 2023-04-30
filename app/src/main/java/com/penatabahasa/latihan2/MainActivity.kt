package com.penatabahasa.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//26 April 2023
//10120212
//Daffa Albari
//IF-6

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }
}