package com.hanzala.i230845

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class CameraActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.camera)

        val closeButton = findViewById<android.view.View>(R.id.closeButton)
        val picture = findViewById<android.view.View>(R.id.picture)
        val capture = findViewById<android.view.View>(R.id.capture)

        closeButton.setOnClickListener {
            finish()
        }

        picture.setOnClickListener {
            startActivity(Intent(this, PhotoPickerActivity::class.java))
        }

        capture.setOnClickListener {
            startActivity(Intent(this, StoryEditorActivity::class.java))
        }
    }
}