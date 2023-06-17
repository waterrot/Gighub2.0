package com.example.gighub

import android.icu.text.SimpleDateFormat
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.gighub.ui.theme.GighubTheme
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gighub.Contact
import java.util.Calendar
import java.util.Locale


/* code to make the overview page work */
class ChatAdapter(private val contacts: List<Contact>) : RecyclerView.Adapter<ChatAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bind(contact)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val contactImageView: ImageView = itemView.findViewById(R.id.contactImageView)
        private val contactNameTextView: TextView = itemView.findViewById(R.id.contactNameTextView)
        private val messageTextView: TextView = itemView.findViewById(R.id.messageTextView)
        private val timeTextView: TextView = itemView.findViewById(R.id.timeTextView)
        private val unreadIndicatorImageView: ImageView = itemView.findViewById(R.id.unreadIndicatorImageView)

        fun bind(contact: Contact) {
            // Bind the data to the views
            contactImageView.setImageResource(getContactImageResource(contact.name))
            contactNameTextView.text = contact.name
            messageTextView.text = contact.lastMessage
            timeTextView.text = getTimeString()
            unreadIndicatorImageView.visibility = View.GONE
        }

        private fun getContactImageResource(name: String): Int {
            // Determine the appropriate image resource based on the contact name
            return when (name) {
                "Guus" -> R.drawable.contact_image_1
                "Margiet" -> R.drawable.contact_image_1
                else -> R.drawable.avatar_placeholder
            }
        }

        private fun getTimeString(): String {
            // Get the current time as a string
            val currentTime = Calendar.getInstance().time
            val timeFormat = SimpleDateFormat("hh:mm a", Locale.getDefault())
            return timeFormat.format(currentTime)
        }
    }
}
