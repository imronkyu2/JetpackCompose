package com.example.jetpackcompose.learnbasic

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R


/**
 * 1.) Basuic Layout*/
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


/**
 * 2.) Modifier Layout*/
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
            Text(
                text = msg,
                modifier = Modifier.offset(x = 10.dp)
            )
            Icon(
                imageVector = Icons.Default.CheckCircle, contentDescription = null,
                modifier = Modifier.align(Alignment.End)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun UserCardPreview() {
    UserCard(name = "Android Developer", msg = "Belajar Jetpack Compose")
}


/**
 * 3.) Componen Slot Layout*/
@Composable
fun SlotBaseLayout() {
    Button(
        onClick = { /*TODO*/ },
        contentPadding = PaddingValues(start = 30.dp, top = 10.dp, end = 30.dp, bottom = 10.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Favorite, contentDescription = null,
            modifier = Modifier
                .size(ButtonDefaults.IconSize)
        )
        Spacer(modifier = Modifier.width(ButtonDefaults.IconSpacing))
        Text(text = "Like")
    }
}

@Preview(showBackground = true)
@Composable
private fun SlotBaseLayoutPreview() {
    SlotBaseLayout()
}

/**
 * 4.) Scaffold Layout*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldSample() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "My Scaffold") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        }

    ) {
        Box(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Hello Compose")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ScaffoldSamplePreview() {
    ScaffoldSample()

}