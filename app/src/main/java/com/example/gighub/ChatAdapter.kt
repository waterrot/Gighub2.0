package com.example.gighub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gighub.ui.theme.GighubTheme
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


/* contact data */
class DataActivity : AppCompatActivity() {
    fun onCreate(savedInstanceState: Bundle?) {
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

/* code to make the overview page work */
class ChatAdapter(private val contacts: List<Contact>) : RecyclerView.Adapter<ChatAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts[position]

        holder.contactNameTextView.text = contact.name
        holder.messageTextView.text = contact.lastMessage
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contactNameTextView: TextView = itemView.findViewById(R.id.contactNameTextView)
        val messageTextView: TextView = itemView.findViewById(R.id.messageTextView)
    }
}
