package com.hanzala.i230845

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class LoginActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.login)

        val createAccount = findViewById<android.view.View>(R.id.createAccount)
        val loginButton = findViewById<android.view.View>(R.id.loginButton)

        createAccount.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener {
            val intent = Intent(this, HomeFeedActivity::class.java)
            startActivity(intent)
        }
    }
}