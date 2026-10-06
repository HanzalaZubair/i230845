package com.hanzala.i230845

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity

class CameraActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.camera)

        val closeButton = findViewById<View>(R.id.closeButton)
        val captureButton = findViewById<View>(R.id.captureButton)

        closeButton.setOnClickListener {
            val intent = Intent(this, HomeFeedActivity::class.java)
            startActivity(intent)
            finish()
        }

        captureButton.setOnClickListener {
            val intent = Intent(this, StoryEditorActivity::class.java)
            startActivity(intent)
        }
    }
}
