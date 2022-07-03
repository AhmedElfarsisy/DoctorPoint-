package com.elfarsisy.doctorpoint.feature.onboarding.presentation.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.elfarsisy.doctorpoint.databinding.LayoutOnboardingBinding
import com.elfarsisy.doctorpoint.feature.onboarding.presentation.viewmodel.OnBoardingModel

class OnBoardingAdapter(private val onBoardingItems: List<OnBoardingModel>) : PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val onboardingBinding = LayoutOnboardingBinding.inflate(
            LayoutInflater.from(container.context),
            container,
            false
        )
        bind(onboardingBinding, onBoardingItems[position])
        container.addView(onboardingBinding.root)
        return onboardingBinding.root
    }

    private fun bind(onboardingBinding: LayoutOnboardingBinding, onBoardingModel: OnBoardingModel) {
        onboardingBinding.mOnBoardingModel = onBoardingModel
        onboardingBinding.executePendingBindings()

    }

    override fun getCount(): Int {
        return onBoardingItems?.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }

}