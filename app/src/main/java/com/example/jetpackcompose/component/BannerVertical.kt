package com.example.jetpackcompose.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R
import com.gunder.market.model.ListCardForYou


@Composable
fun MainBannerVertical(modifier: Modifier = Modifier, listBanner: ListCardForYou) {
    Card(
        modifier = modifier.padding(start = 16.dp, end = 4.dp, top = 8.dp, bottom = 8.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(Color.Transparent)
    ) {
        Image(
            painter = painterResource(id = listBanner.imgCard),
            contentDescription = stringResource(id = listBanner.txtDesc)
        )
    }
}

@Preview
@Composable
private fun MainBannerVerticalPreview() {
    MainBannerVertical(
        listBanner = ListCardForYou(
            R.drawable.banner_vertikal2,
            R.string.txt_desc_five_banner
        )
    )
}