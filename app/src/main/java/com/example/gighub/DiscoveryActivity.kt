package com.example.gighub

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity

class DiscoveryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.discovery2)

        /* go to discovery3 page 2 */
        val buttonGoToDiscoveryTwo = findViewById<ImageView>(R.id.goNextDiscovery)

        buttonGoToDiscoveryTwo.setOnClickListener {
            val intent = android.content.Intent(this, DiscoveryTwoActivity::class.java)
            startActivity(intent)
        }
    }


}
