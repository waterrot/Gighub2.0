package com.example.gighub

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

/* contact data */
class DataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chat_overview)

        val recyclerView: RecyclerView = findViewById(R.id.chatList)
        val contacts: List<Contact> = listOf(
            Contact("John Doe", "Hello!"),
            Contact("Jane Smith", "Hi there!"),
            Contact("Alex Johnson", "Hey, how are you?")
        )

        val adapter = ChatAdapter(contacts)
        recyclerView.adapter = adapter
    }
}
