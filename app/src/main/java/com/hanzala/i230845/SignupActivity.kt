package com.hanzala.i230845

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class SignupActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.signup)

        val backButton = findViewById<android.view.View>(R.id.backButton)
        val createAccountButton = findViewById<android.view.View>(R.id.createAccountButton)
        val loginText = findViewById<android.view.View>(R.id.loginText)

        backButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        createAccountButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        loginText.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}