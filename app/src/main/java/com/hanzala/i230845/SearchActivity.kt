package com.hanzala.i230845

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class SearchActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.search)

        val backToHome = findViewById<android.view.View>(R.id.backtohome)
        val omarFarooq = findViewById<android.view.View>(R.id.omarFarooq)

        backToHome.setOnClickListener {
            startActivity(Intent(this, HomeFeedActivity::class.java))
            finish()
        }

        omarFarooq.setOnClickListener {
            startActivity(Intent(this, OtherProfileActivity::class.java))
        }
    }
}