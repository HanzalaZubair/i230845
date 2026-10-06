package com.hanzala.i230845

import android.os.Bundle
import androidx.activity.ComponentActivity

class PhotoPickerActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.photopicker)

        val cancelButton = findViewById<android.view.View>(R.id.cancelButton)

        cancelButton.setOnClickListener {
            finish()
        }
    }
}