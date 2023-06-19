import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.gighub.R

class ChatActivity : AppCompatActivity() {

    private val messageList = mutableListOf<Message>()
    private lateinit var messageAdapter: MessageAdapter

    private lateinit var messageEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.message_list_activity)

        // Initialize views
        val sendButton = findViewById<Button>(R.id.button_gchat_send)
        messageEditText = findViewById(R.id.edit_gchat_message)
        val chatListView = findViewById<ListView>(R.id.layout_group_chat)

        // Create adapter and attach it to the ListView
        messageAdapter = MessageAdapter(this, messageList)
        chatListView.adapter = messageAdapter

        // Handle send button click
        sendButton.setOnClickListener {
            val messageText = messageEditText.text.toString().trim()
            if (messageText.isNotEmpty()) {
                val message = Message("You", messageText)
                messageList.add(message)
                messageAdapter.notifyDataSetChanged()
                messageEditText.text.clear()
            }
        }
    }
}

data class Message(val sender: String, val message: String)
