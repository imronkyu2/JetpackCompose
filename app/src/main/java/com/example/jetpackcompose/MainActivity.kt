package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.component.MainTopBar
import com.example.jetpackcompose.component.MainTopCategory
import com.example.jetpackcompose.component.TopMenu
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import com.gunder.market.model.dummyListTopCategory
import com.gunder.market.model.dummyListTopMenus

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }

            }
        }
    }
}

@Composable
fun MainCategoryTop(modifier: Modifier = Modifier) {
    LazyRow {
        items(dummyListTopCategory) {
            MainTopCategory(listTopCategory = it)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MainCategoryTopPreview() {
    MainCategoryTop()
}

@Composable
fun MainTopMenu(modifier: Modifier = Modifier) {
    LazyRow {
        items(dummyListTopMenus) {
            TopMenu(listTopMenu = it)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MainTopBar() {
    JetpackComposeTheme {
        MainTopMenu()
    }
}

@Composable
fun MarketApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.verticalScroll(rememberScrollState())
    ) {
        MainTopBar()
        MainTopMenu()
        MainCategoryTop()
    }

}

@Preview(showBackground = true)
@Composable
private fun MarketAppPreview() {
    MarketApp()
}


