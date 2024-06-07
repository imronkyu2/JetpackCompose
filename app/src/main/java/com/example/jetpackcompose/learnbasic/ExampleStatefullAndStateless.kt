package com.example.jetpackcompose.learnbasic

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


/**
 * Example of stateful component*/
@Composable
fun StateFullComponent() {
    var count by remember { mutableStateOf(0) }

    Column {
        Text(text = "StateFull: $count")
        Button(onClick = { count++ }) {
            Text(text = "Tambah Data")
        }
    }
}

/**
 * =========================================================================
 * Example of stateless component*/
@Composable
fun MainScreen() {
    var count by remember { mutableStateOf(0) }
    StateLessComponent(count, onButtonClick = { count++ })
}

@Composable
fun StateLessComponent(count: Int, onButtonClick: () -> Unit) {
    Text(text = "StateLess: $count")
    Column {
        Button(onClick = { onButtonClick() }) {
            Text(text = "Tambah Data")
        }
    }
}


/**
 * =========================================================================
 * Preview*/
@Preview(showBackground = true)
@Composable
private fun StateFullComponentPreview() {
    Column() {
        StateFullComponent()
        Spacer(modifier = Modifier.height(16.dp))
        MainScreen()
    }

}