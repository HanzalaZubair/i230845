package com.hanzala.i230845

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class StoryViewerActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.storyviewer)

        val closeButton = findViewById<android.view.View>(R.id.closeButton)

        closeButton.setOnClickListener {
            startActivity(Intent(this, HomeFeedActivity::class.java))
            finish()
        }
    }
}