package com.example.techparadise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class chatRoom : AppCompatActivity() {

    private lateinit var NSSx: Button
    private lateinit var CSIx: Button
    private lateinit var RCx: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_room)

        NSSx=findViewById(R.id.btn_NSS)
        CSIx=findViewById(R.id.btn_CSI)
        RCx=findViewById(R.id.btn_RC)

        NSSx.setOnClickListener{
            intent = Intent(this,NSS_page::class.java)
            startActivity(intent)
        }
        CSIx.setOnClickListener{
            intent = Intent(this,CSI_page::class.java)
            startActivity(intent)
        }
        RCx.setOnClickListener{
            intent = Intent(this,RC_page::class.java)
            startActivity(intent)
        }
    }
}