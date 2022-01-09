package com.example.techparadise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {



    private lateinit var edtemail: EditText
    private lateinit var edtpassword: EditText
    private lateinit var login: Button
    private lateinit var signupx: Button
    private lateinit var  mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        edtemail = findViewById(R.id.ipemail)
        edtpassword = findViewById(R.id.ippass)
        login = findViewById(R.id.loginbtn)
        signupx = findViewById(R.id.signupbtn)
        mAuth = FirebaseAuth.getInstance()

        signupx.setOnClickListener {
            val intent = Intent(this,ASNSS::class.java)
            startActivity(intent)
        }
        login.setOnClickListener{
            val email = edtemail.text.toString()
            val pass = edtpassword.text.toString()

            logint(email,pass);
        }

    }
    private fun logint(email : String, pass : String){
        mAuth.signInWithEmailAndPassword(email, pass)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val intent = Intent(this@MainActivity, chatRoom::class.java)
                    startActivity(intent)
                } else {
                   Toast.makeText(this@MainActivity,"No User",Toast.LENGTH_SHORT).show()
                }
            }
    }
}