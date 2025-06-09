package com.example.vodafoneidea

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.vodafoneidea.Presentation.ui.IntroScreen
import com.example.vodafoneidea.ui.theme.VodafoneIdeaTheme

import androidx.lifecycle.lifecycleScope
import com.example.vodafoneidea.Presentation.ui.MidScreen
import kotlinx.coroutines.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VodafoneIdeaTheme {
                var showIntro by remember { mutableStateOf(true) }

                // Coroutine that waits 3 seconds and then changes the screen
                LaunchedEffect(Unit) {
                    delay(3000)
                    showIntro = false
                }

                if (showIntro) {
                    IntroScreen()
                } else {
                    MidScreen()
                }
            }
        }
    }
}


