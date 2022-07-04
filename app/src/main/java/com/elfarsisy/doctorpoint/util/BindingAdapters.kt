package com.elfarsisy.doctorpoint.util

import android.content.res.Resources
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.databinding.BindingAdapter
import com.elfarsisy.doctorpoint.R
import com.elfarsisy.doctorpoint.helper.setImageResourceWithId

@BindingAdapter("android:resourceText")
fun setText(textView: TextView, @StringRes resId: Int) {
    textView.setText(resId)
}

@BindingAdapter("android:resourceImage")
fun setImage(imageView: ImageView, resId: Int) {
    imageView.setImageResourceWithId(resId)
}
