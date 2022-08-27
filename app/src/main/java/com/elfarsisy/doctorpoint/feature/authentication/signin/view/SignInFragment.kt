package com.elfarsisy.doctorpoint.feature.authentication.signin.view

import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.elfarsisy.doctorpoint.R
import com.elfarsisy.doctorpoint.base.ui.view.DPBaseFragment
import com.elfarsisy.doctorpoint.databinding.FragmentSignInBinding
import com.elfarsisy.doctorpoint.feature.authentication.signin.viewmodel.SignInViewModel

class SignInFragment : DPBaseFragment<FragmentSignInBinding, SignInViewModel>() {
    override fun initViewModel() {
        val mViewModel: SignInViewModel by activityViewModels()
        viewModel = mViewModel
    }

    override fun initBinding(container: ViewGroup?): FragmentSignInBinding {
        return DataBindingUtil.inflate(
            layoutInflater,
            R.layout.fragment_sign_in,
            container,
            false
        )
    }

    override fun onFragmentCreated() {
        binding.mViewModel = viewModel
        binding.lifecycleOwner = this
    }
}