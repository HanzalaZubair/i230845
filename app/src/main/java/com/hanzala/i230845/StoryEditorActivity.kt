package com.hanzala.i230845

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class StoryEditorActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.storyeditor)

        val closeButton = findViewById<android.view.View>(R.id.closeButton)
        val yourStory = findViewById<android.view.View>(R.id.yourStory)
        val nextButton = findViewById<android.view.View>(R.id.nextButton)

        closeButton.setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
            finish()
        }

        yourStory.setOnClickListener {
            startActivity(Intent(this, YourStoryActivity::class.java))
            finish()
        }

        nextButton.setOnClickListener {
            startActivity(Intent(this, HomeFeedActivity::class.java))
            finish()
        }
    }
}