package com.example.jetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Jetpack Compose",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun UserProfile() {
    Box(modifier = Modifier) {
        Image(
            painter = painterResource(id = R.drawable.man),
            contentDescription = null,
            modifier = Modifier.padding(24.dp)
        )
        Icon(
            imageVector = Icons.Default.Create,
            contentDescription = null,
            Modifier
                .size(24.dp)
                .align(Alignment.BottomEnd)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun UserProfilePreview() {
    UserProfile()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
        Greeting("Android")
    }
}


@Composable
fun UserCard(name: String, msg: String) {
    Row(
        modifier = Modifier
            .padding(4.dp)
            .clickable { }

    ) {
        Image(
            painter = painterResource(R.drawable.man),
            contentDescription = null,
            modifier = Modifier
                .padding(4.dp)
                .size(60.dp)
                .border(2.dp, Color.Gray, CircleShape)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth()
        ) {
            Text(text = name, fontWeight = FontWeight.Bold)
            Text(text = msg,
                modifier = Modifier.offset(x = 10.dp))
            Icon(imageVector = Icons.Default.CheckCircle, contentDescription = null,
                modifier = Modifier.align(Alignment.End))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun UserCardPreview() {
    UserCard(name = "Android Developer", msg = "Belajar Jetpack Compose")
}
