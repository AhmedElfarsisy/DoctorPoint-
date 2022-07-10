package com.elfarsisy.doctorpoint.feature.authentication.view

import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.elfarsisy.doctorpoint.R
import com.elfarsisy.doctorpoint.base.ui.view.DPBaseActivity
import com.elfarsisy.doctorpoint.databinding.ActivityAuthnticationBinding
import com.elfarsisy.doctorpoint.feature.authentication.viewmodel.AuthenticationViewModel

class AuthenticationActivity :
    DPBaseActivity<ActivityAuthnticationBinding, AuthenticationViewModel>() {
    override fun initViewModel() {
        val mViewModel: AuthenticationViewModel by viewModels()
        viewModel = mViewModel
    }

    override fun initBinding(): ActivityAuthnticationBinding {
        return DataBindingUtil.setContentView(this, R.layout.activity_authntication)
    }

    override fun onActivityCreated() {
        binding.mViewModel = viewModel
        binding.lifecycleOwner = this

    }
}