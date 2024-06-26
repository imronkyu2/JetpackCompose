package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.component.BottomBar
import com.example.jetpackcompose.component.BottomCategory
import com.example.jetpackcompose.component.CartCategory
import com.example.jetpackcompose.component.MainBannerVertical
import com.example.jetpackcompose.component.MainImageCategory
import com.example.jetpackcompose.component.MainTopBar
import com.example.jetpackcompose.component.MainTopCategory
import com.example.jetpackcompose.component.TopMenu
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import com.gunder.market.model.dummyListBanner
import com.gunder.market.model.dummyListBottomCategory
import com.gunder.market.model.dummyListCardForYou
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
fun MainBottomCategory(modifier: Modifier = Modifier) {
    LazyRow {
        items(dummyListBottomCategory) {
            BottomCategory(listBottomCategory = it)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MainBottomCategoryPreview() {
    MainBottomCategory()
}

@Composable
fun MainCartCategory(modifier: Modifier = Modifier) {
    LazyRow {
        items(dummyListBanner){
            CartCategory(listBanner = it)
        }
    }
}

@Composable
fun MarketApp(modifier: Modifier = Modifier) {
    Scaffold(bottomBar = { BottomBar()}) {
        paddingValues ->
        Column(
            modifier = modifier.verticalScroll(rememberScrollState())
                .padding(paddingValues)
        ) {
            MainTopBar()
            MainTopMenu()
            MainCategoryTop()
            MainCartCategory()
            MainBottomCategory()
            MainImageCategory()
            MainListBannerVertical()
        }

    }


}

@Preview(showBackground = true)
@Composable
private fun MarketAppPreview() {
    MarketApp()
}

@Composable
fun MainListBannerVertical(modifier: Modifier = Modifier) {
    LazyRow {
        items(dummyListCardForYou){
            MainBannerVertical(listBanner = it)
        }
    }
}


