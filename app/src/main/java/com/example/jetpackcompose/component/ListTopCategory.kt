package com.example.jetpackcompose.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.R
import com.gunder.market.model.ListCategory

@Composable
fun MainTopCategory(modifier: Modifier = Modifier, listTopCategory: ListCategory) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Image(
            painter = painterResource(id = listTopCategory.imgTopCategory),
            contentDescription = "imgTopCategory",
            modifier = modifier.size(40.dp)
        )
        Text(text = stringResource(id = listTopCategory.txtTopCategory), fontSize = 12.sp)
    }
}

@Preview(showBackground = true)
@Composable
private fun MainTopCategoryPreview() {
    MainTopCategory(listTopCategory = ListCategory(R.drawable.cicil, R.string.txt_credit))
}