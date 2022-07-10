package com.elfarsisy.doctorpoint.feature.onboarding.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.elfarsisy.doctorpoint.R
import com.elfarsisy.doctorpoint.base.ui.viewmodel.DPBaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModel @Inject constructor() : DPBaseViewModel() {

    val onBoardings = listOf<OnBoardingModel>(
        OnBoardingModel(2, R.string.onboarding_title1, R.string.onboarding_message1),
        OnBoardingModel(3, R.string.onboarding_title2, R.string.onboarding_message2),
        OnBoardingModel(4, R.string.onboarding_title3, R.string.onboarding_message3)
    )
}