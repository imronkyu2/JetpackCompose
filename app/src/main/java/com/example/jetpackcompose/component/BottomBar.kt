package com.example.jetpackcompose.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.R
import com.gunder.market.model.BottomBarItem

@Composable
fun BottomBar(modifier: Modifier = Modifier) {
    NavigationBar(modifier = modifier) {
        val bottomNavigation = listOf(
            BottomBarItem(
                title = stringResource(R.string.txt_home),
                icon = Icons.Default.Home
            ),
            BottomBarItem(
                title = stringResource(R.string.txt_official_store),
                icon = Icons.Default.ShoppingCart
            ),
            BottomBarItem(
                title = stringResource(R.string.txt_notification),
                icon = Icons.Default.Notifications
            ),
            BottomBarItem(
                title = stringResource(R.string.txt_profile),
                icon = Icons.Default.Person
            )
        )

        bottomNavigation.map {
            NavigationBarItem(selected = it.title == bottomNavigation[0].title,
                onClick = { /*TODO*/ },
                icon = { Icon(imageVector = it.icon, contentDescription = it.title) },
                label = { Text(text = it.title) })
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun BottomBarPreview() {
    BottomBar()
}