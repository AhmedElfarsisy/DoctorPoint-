package com.elfarsisy.doctorpoint.feature.onboarding.presentation.view

import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.elfarsisy.doctorpoint.R
import com.elfarsisy.doctorpoint.base.ui.view.DPBaseActivity
import com.elfarsisy.doctorpoint.databinding.ActivityOnboardingBinding
import com.elfarsisy.doctorpoint.feature.onboarding.presentation.adapter.OnBoardingAdapter
import com.elfarsisy.doctorpoint.feature.onboarding.presentation.viewmodel.OnBoardingViewModel

class OnBoardingActivity : DPBaseActivity<ActivityOnboardingBinding, OnBoardingViewModel>() {
    override fun initViewModel() {
        val mViewModel: OnBoardingViewModel by viewModels()
        viewModel = mViewModel
    }

    override fun initBinding(): ActivityOnboardingBinding {
        return DataBindingUtil.setContentView(this, R.layout.activity_onboarding)
    }

    override fun onActivityCreated() {
        binding.mViewModel = viewModel
        binding.lifecycleOwner = this
        setUpOnBoardingAdapter()
    }

    private fun setUpOnBoardingAdapter() {
        binding.viewPager.adapter = OnBoardingAdapter(viewModel.onBoardings)
        binding.tabLayout.setSelectedTabIndicator(R.drawable.ic_selected_indicator)
        binding.tabLayout.setupWithViewPager(binding.viewPager, true)
    }

}