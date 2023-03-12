package com.asikul.contactmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        //Redirecting to SignUp page
        val tvSignup = findViewById<TextView>(R.id.tvSignUp)
        tvSignup.setOnClickListener {
            val intentToSignUpActivity = Intent(this, SignUpActivity :: class.java)
            startActivity(intentToSignUpActivity)
        }

        //When click on SignIn Button.
        val btnSignIn = findViewById<Button>(R.id.btnSignIn)
        btnSignIn.setOnClickListener {
            val intentToMainActivity = Intent(this, MainActivity::class.java)
            startActivity(intentToMainActivity)
        }

        //finish()
    }
}