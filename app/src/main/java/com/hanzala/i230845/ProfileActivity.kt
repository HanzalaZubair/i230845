package com.hanzala.i230845

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class ProfileActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.profile)

        val editProfile = findViewById<android.view.View>(R.id.editProfile)
        val backButton = findViewById<android.view.View>(R.id.backButton)
        val search = findViewById<android.view.View>(R.id.search)
        val addToStory = findViewById<android.view.View>(R.id.addToStory)

        editProfile.setOnClickListener {
            startActivity(Intent(this, EditProfileActivity::class.java))
        }

        backButton.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }

        search.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        addToStory.setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }
    }
}