package com.elfarsisy.doctorpoint.helper

import androidx.annotation.DrawableRes
import com.elfarsisy.doctorpoint.R

class IconHelper {
    companion object {
        @DrawableRes
        fun getIconBy(iconId: Int) =
            when (iconId) {
                1 -> R.drawable.ic_logo_foreground
                2 -> R.drawable.ic_onboarding1
                3 -> R.drawable.ic_onboarding2
                4 -> R.drawable.ic_onboarding3
                else -> R.drawable.ic_logo_foreground
            }
    }
}