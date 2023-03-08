package com.example.herosvsuniverse.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * [Lutas] is the data class to represent the Lutas text and imageResourceId
 */
data class Lutas(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val stringResourceIdHeroi: Int,
    @DrawableRes val imageResourceIdHeroi: Int
)