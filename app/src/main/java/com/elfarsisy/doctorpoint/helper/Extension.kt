package com.elfarsisy.doctorpoint.helper

import android.widget.ImageView

fun ImageView.setImageResourceWithId(iconId:Int){
    this.setImageResource(IconHelper.getIconBy(iconId))
}