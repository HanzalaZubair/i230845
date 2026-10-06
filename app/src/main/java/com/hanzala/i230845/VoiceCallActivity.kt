package com.hanzala.i230845

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class VoiceCallActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.voicecall)

        val endCallButton = findViewById<android.view.View>(R.id.endCallButton)

        endCallButton.setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
            finish()
        }
    }
}