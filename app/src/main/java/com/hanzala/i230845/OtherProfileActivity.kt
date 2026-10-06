package com.hanzala.i230845

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class OtherProfileActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.otherprofile)

        val backButton = findViewById<android.view.View>(R.id.backButton)

        backButton.setOnClickListener {
            finish()
        }
    }
}