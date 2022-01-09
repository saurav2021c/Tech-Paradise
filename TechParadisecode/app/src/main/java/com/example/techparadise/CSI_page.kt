package com.example.techparadise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class CSI_page : AppCompatActivity() {

    private lateinit var msgbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_csi_page)

        msgbtn = findViewById(R.id.button_gnrl)

        msgbtn.setOnClickListener{
            Toast.makeText(this,"Available soon", Toast.LENGTH_SHORT).show()
        }
    }
}