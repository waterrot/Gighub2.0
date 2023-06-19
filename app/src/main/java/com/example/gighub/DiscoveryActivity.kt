package com.example.gighub

import android.os.Bundle
import android.widget.ImageView
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

class DiscoveryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.discovery)

        /* go to discovery page 2 */
        val buttonGoToDiscoveryTwo = findViewById<ImageView>(R.id.goNextDiscovery)

        buttonGoToDiscoveryTwo.setOnClickListener {
            val intent = android.content.Intent(this, DiscoveryTwoActivity::class.java)
            startActivity(intent)
        }
    }


}
