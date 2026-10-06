package com.hanzala.i230845

import android.os.Bundle
import androidx.activity.ComponentActivity

class CommentsActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.comments)

        val backButton = findViewById<android.view.View>(R.id.backButton)

        backButton.setOnClickListener {
            finish()
        }
    }
}