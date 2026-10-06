package com.hanzala.i230845

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class MenuActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.menu)

        val search = findViewById<android.view.View>(R.id.search)
        val messenger = findViewById<android.view.View>(R.id.messenger)
        val home = findViewById<android.view.View>(R.id.home)
        val friends = findViewById<android.view.View>(R.id.friends)
        val market = findViewById<android.view.View>(R.id.market)
        val notification = findViewById<android.view.View>(R.id.notification)
        val menu = findViewById<android.view.View>(R.id.menu)
        val profile = findViewById<android.view.View>(R.id.profile)
        val logout = findViewById<android.view.View>(R.id.logout)

        search.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        messenger.setOnClickListener {
            startActivity(Intent(this, ChatsActivity::class.java))
        }

        home.setOnClickListener {
            startActivity(Intent(this, HomeFeedActivity::class.java))
            finish()
        }

        friends.setOnClickListener {
            startActivity(Intent(this, FriendsActivity::class.java))
            finish()
        }

        market.setOnClickListener {
            startActivity(Intent(this, MarketplaceActivity::class.java))
            finish()
        }

        notification.setOnClickListener {
            startActivity(Intent(this, NotificationsActivity::class.java))
            finish()
        }

        menu.setOnClickListener {
            finish()
        }

        profile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        logout.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}