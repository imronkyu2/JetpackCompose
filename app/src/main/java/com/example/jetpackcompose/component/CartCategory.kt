package com.example.jetpackcompose.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R
import com.gunder.market.model.ListBanner


@Composable
fun CartCategory(modifier: Modifier = Modifier, listBanner: ListBanner) {
    Card(
        modifier = modifier
            .widthIn(200.dp)
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .heightIn(60.dp), shape = RoundedCornerShape(8.dp)
    ) {
        Image(
            painter = painterResource(id = listBanner.imgBanner),
            contentDescription = "imgBanner"
        )
    }
}

@Preview
@Composable
private fun CartCategoryPreview() {
    CartCategory(listBanner = ListBanner(R.drawable.banner1));
}