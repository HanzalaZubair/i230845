package com.hanzala.i230845

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import kotlin.jvm.java

class HomeFeedActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.homefeed)

        val search = findViewById<android.view.View>(R.id.search)
        val messenger = findViewById<android.view.View>(R.id.messenger)
        val home = findViewById<android.view.View>(R.id.home)
        val friends = findViewById<android.view.View>(R.id.friends)
        val marketplace = findViewById<android.view.View>(R.id.marketplace)
        val notification = findViewById<android.view.View>(R.id.notification)
        val menu = findViewById<android.view.View>(R.id.menu)

        val createPost = findViewById<android.view.View>(R.id.createPost)
        val photoPicker = findViewById<android.view.View>(R.id.photoPicker)

        val addStory = findViewById<android.view.View>(R.id.addStory)
        val yourStory = findViewById<android.view.View>(R.id.yourStory)
        val omarStory = findViewById<android.view.View>(R.id.omarStory)

        val postCaption = findViewById<android.view.View>(R.id.postCaption)
        val comments = findViewById<android.view.View>(R.id.comments)

        search.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        messenger.setOnClickListener {
            startActivity(Intent(this, ChatsActivity::class.java))
        }

        home.setOnClickListener {
            startActivity(Intent(this, HomeFeedActivity::class.java))
        }

        friends.setOnClickListener {
            startActivity(Intent(this, FriendsActivity::class.java))
        }

        marketplace.setOnClickListener {
            startActivity(Intent(this, MarketplaceActivity::class.java))
        }

        notification.setOnClickListener {
            startActivity(Intent(this, NotificationsActivity::class.java))
        }

        menu.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
        }

        createPost.setOnClickListener {
            startActivity(Intent(this, CreatePostActivity::class.java))
        }

        photoPicker.setOnClickListener {
            startActivity(Intent(this, PhotoPickerActivity::class.java))
        }

        addStory.setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }

        yourStory.setOnClickListener {
            startActivity(Intent(this, YourStoryActivity::class.java))
        }

        omarStory.setOnClickListener {
            startActivity(Intent(this, StoryViewerActivity::class.java))
        }

        postCaption.setOnClickListener {
            startActivity(Intent(this, ReactionPickerActivity::class.java))
        }

        comments.setOnClickListener {
            startActivity(Intent(this, CommentsActivity::class.java))
        }
    }
}