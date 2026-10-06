package com.hanzala.i230845

import android.os.Bundle
import androidx.activity.ComponentActivity

class CreatePostActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.createpost)

        val closeButton = findViewById<android.view.View>(R.id.closeButton)
        val postButton = findViewById<android.view.View>(R.id.postButton)

        closeButton.setOnClickListener {
            finish()
        }

        postButton.setOnClickListener {
            finish()
        }
    }
}