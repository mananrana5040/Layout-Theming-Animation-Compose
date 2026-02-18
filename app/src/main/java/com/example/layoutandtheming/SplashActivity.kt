package com.example.layoutandtheming

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutandtheming.ui.theme.LayoutAndThemingTheme

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Splash(onTimeout = {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            })
        }


    }
}

@Composable
fun Splash(onTimeout: () -> Unit) {

    var progress by remember { mutableFloatStateOf(0f) }

    val animatedProgress by animateFloatAsState(
        targetValue = progress,
        animationSpec = tween(durationMillis = 3000, easing = LinearEasing),
        label = "progressAnimation"
    )

    LaunchedEffect(Unit) {
        progress = 1f
    }

    LaunchedEffect(animatedProgress) {
        if (animatedProgress >= 1f) {
            onTimeout()
        }
    }

    Box(Modifier.fillMaxSize()) {

        Column(
            Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(painter = painterResource(id = R.drawable.ic_jetpack), contentDescription = null)

            Spacer(Modifier.padding(vertical = 10.dp))
            Text(text = "Jetpack Compose", style = MaterialTheme.typography.titleMedium)
            Spacer(Modifier.padding(vertical = 5.dp))
            Text(text = "Build better apps faster with compose", style = MaterialTheme.typography.bodyMedium)
        }

        LinearProgressIndicator(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 40.dp)
                .padding(horizontal = 32.dp)
                .fillMaxWidth()
                .height(10.dp),
            progress = { animatedProgress },
            color = Color(0xFF3ddb85),
            trackColor = Color.LightGray,
            strokeCap = StrokeCap.Round,
            gapSize = 0.dp,
            drawStopIndicator = {}
        )


    }

}

@Preview(showBackground = true)
@Composable
fun SplashPreview() {
    Splash(onTimeout = {})
}