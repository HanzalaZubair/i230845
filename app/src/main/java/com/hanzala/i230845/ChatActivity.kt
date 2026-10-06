package com.hanzala.i230845

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class ChatActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.chat)

        val backButton = findViewById<android.view.View>(R.id.backButton)
        val callButton = findViewById<android.view.View>(R.id.callButton)

        backButton.setOnClickListener {
            startActivity(Intent(this, ChatsActivity::class.java))
            finish()
        }

        callButton.setOnClickListener {
            startActivity(Intent(this, VoiceCallActivity::class.java))
        }
    }
}