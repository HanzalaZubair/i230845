package com.hanzala.i230845

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import kotlin.jvm.java

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.splash)

        val splash = findViewById<android.view.View>(R.id.splash)

        splash.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}