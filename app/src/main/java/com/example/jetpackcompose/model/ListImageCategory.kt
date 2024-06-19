package com.gunder.market.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.jetpackcompose.R

data class ListImageCategory(@DrawableRes val imgCard: Int, @StringRes val txtDesc: Int)

val dummyListImageCategory= listOf(
    R.drawable.banner_horizontal_1 to (R.string.txt_desc_first_banner),
    R.drawable.banner_horizontal_2 to (R.string.txt_desc_second_banner),
    R.drawable.banner_horizontal_3 to (R.string.txt_desc_third_banner),
    R.drawable.banner_horizontal_4 to (R.string.txt_desc_fourth_banner),
).map { ListCardForYou(it.first, it.second) }
