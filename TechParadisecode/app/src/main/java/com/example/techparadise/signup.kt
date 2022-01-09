package com.example.techparadise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.PopupMenu

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val var1 = findViewById<Button>(R.id.adminx2)

        var1.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,ASNSS::class.java)
            startActivity(intent)
        })

        val var2 = findViewById<Button>(R.id.adminx3)

        var2.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,ascsi::class.java)
            startActivity(intent)
        })

        val var3 = findViewById<Button>(R.id.adminx)

        var3.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,asrctcet::class.java)
            startActivity(intent)
        })

        val var4 = findViewById<Button>(R.id.volnteerx)

        var4.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,SSNSS::class.java)
            startActivity(intent)
        })

        val var5 = findViewById<Button>(R.id.volnteerx2)

        var5.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,sscsi::class.java)
            startActivity(intent)
        })

        val var6 = findViewById<Button>(R.id.volnteerx3)

        var6.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,ssrctcet::class.java)
            startActivity(intent)
        })
    }
}