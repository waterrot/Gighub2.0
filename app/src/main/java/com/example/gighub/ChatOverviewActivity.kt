package com.example.gighub

import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gighub.ui.theme.GighubTheme
import com.google.android.material.bottomnavigation.BottomNavigationView

class ChatOverviewActivity : CustomActivity() {

    lateinit var bottomNav: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chat_overview)
        supportActionBar?.hide()

        /* Navbar */
        bottomNav = findViewById(R.id.bottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNav)

        val chatData = listOf(
            Contact("Margiet", "Hi, about last night..."),
            Contact("Guus", "ZE WEET ALLES"),
            Contact("BABE", "Where are you?!?!"),
            // Add more contacts as needed
        )

        val chatListRecyclerView = findViewById<RecyclerView>(R.id.chatList)
        chatListRecyclerView.layoutManager = LinearLayoutManager(this)
        chatListRecyclerView.adapter = ChatAdapter(chatData)

        /* go to chatting */
        val goChatting = findViewById<RecyclerView>(R.id.chatList)

        goChatting.setOnClickListener {
            val intent = android.content.Intent(this, ChatActivity::class.java)
            startActivity(intent)
        }
    }
}