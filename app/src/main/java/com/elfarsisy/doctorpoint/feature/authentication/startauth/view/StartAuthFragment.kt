package com.elfarsisy.doctorpoint.feature.authentication.startauth.view

import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.elfarsisy.doctorpoint.R
import com.elfarsisy.doctorpoint.base.ui.view.DPBaseFragment
import com.elfarsisy.doctorpoint.databinding.FragmentStartAuthBinding
import com.elfarsisy.doctorpoint.feature.authentication.startauth.viewmodel.StartAuthViewModel

class StartAuthFragment : DPBaseFragment<FragmentStartAuthBinding, StartAuthViewModel>() {
    override fun initViewModel() {
        val mViewModel: StartAuthViewModel by activityViewModels()
    }

    override fun initBinding(container: ViewGroup?): FragmentStartAuthBinding {
        return DataBindingUtil.inflate(
            layoutInflater,
            R.layout.fragment_start_auth,
            container,
            false
        )
    }

    override fun onFragmentCreated() {
        binding.mViewModel = viewModel
        binding.lifecycleOwner = this
    }
}