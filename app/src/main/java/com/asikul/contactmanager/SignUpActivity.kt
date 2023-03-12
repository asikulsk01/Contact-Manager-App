package com.asikul.contactmanager

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        //Redirecting to signing page.
        val tvSignin = findViewById<TextView>(R.id.tvSignIn)
        tvSignin.setOnClickListener {
            val intentToSignInActivity = Intent(this, SignInActivity::class.java)
            startActivity(intentToSignInActivity)
        }



        //When click on SignUp button.
        val btnSignUp = findViewById<Button>(R.id.btnSignUp)
        btnSignUp.setOnClickListener {
            val intentToSignInActivity2 = Intent(this, SignInActivity::class.java)
            startActivity(intentToSignInActivity2)
        }


    }
}