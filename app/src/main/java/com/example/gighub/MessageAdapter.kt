import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.gighub.R

class MessageAdapter(context: Context, private val messages: List<Message>) :
    ArrayAdapter<Message>(context, R.layout.item_chat_me, messages) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.item_chat_me, parent, false)

        val senderTextView = view.findViewById<TextView>(R.id.card_gchat_message_me)
        val messageTextView = view.findViewById<TextView>(R.id.messageTextView)

        val message = messages[position]
        senderTextView.text = message.sender
        messageTextView.text = message.message

        return view
    }
}
