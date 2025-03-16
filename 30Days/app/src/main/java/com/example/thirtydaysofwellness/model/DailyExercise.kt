package com.example.thirtydaysofwellness.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DailyExercise(
    @StringRes val day: Int,
    @StringRes val exerciseTitle: Int,
    @DrawableRes val image: Int,
    @StringRes val exerciseDescription: Int
)
