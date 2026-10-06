package com.hanzala.i230845

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class ChatsActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.chats)

        val backToHome = findViewById<android.view.View>(R.id.backToHome)
        val aishaChat = findViewById<android.view.View>(R.id.aishaChat)

        backToHome.setOnClickListener {
            startActivity(Intent(this, HomeFeedActivity::class.java))
            finish()
        }

        aishaChat.setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }
    }
}