package com.example.gighub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gighub.ui.theme.GighubTheme

class ChatOverviewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chat_overview)

        val chatData = listOf(
            Contact("Margiet", "Hi, about last night..."),
            Contact("Guus", "ZE WEET ALLES"),
            Contact("BABE", "Where are you?!?!"),
            // Add more contacts as needed
        )

        val chatListRecyclerView = findViewById<RecyclerView>(R.id.chatList)
        chatListRecyclerView.layoutManager = LinearLayoutManager(this)
        chatListRecyclerView.adapter = ChatAdapter(chatData)
    }
}