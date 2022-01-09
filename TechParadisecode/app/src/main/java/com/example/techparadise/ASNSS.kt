package com.example.techparadise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class ASNSS : AppCompatActivity() {

    private lateinit var edtname: EditText
    private lateinit var edtbranch: EditText
    private lateinit var edtyear: Number
    private lateinit var edtrollno: Number
    private lateinit var edtdiv: EditText
    private lateinit var edtmobileno: Number
    private lateinit var edtpassword: EditText
    private lateinit var edtemail: EditText
    private lateinit var signupx: Button
    private lateinit var  mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asnss)

        supportActionBar?.hide()

        edtemail = findViewById(R.id.edt_eMail)
        edtpassword = findViewById(R.id.edt_password)
        signupx = findViewById(R.id.signup)
        mAuth = FirebaseAuth.getInstance()

        signupx.setOnClickListener{
            val email = edtemail.text.toString()
            val pass = edtpassword.text.toString()
                signUp(email,pass)
            }
        }
    private fun signUp(email : String, pass : String){
        mAuth.createUserWithEmailAndPassword(email, pass)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {

                        intent = Intent(this@ASNSS,chatRoom::class.java)
                        startActivity(intent)

                } else {
                    Toast.makeText(this@ASNSS,"Error",Toast.LENGTH_SHORT).show()
                }
            }
    }
}