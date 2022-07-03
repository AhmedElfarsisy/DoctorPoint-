package com.elfarsisy.doctorpoint.base.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.elfarsisy.doctorpoint.base.ui.viewmodel.DPBaseViewModel

abstract class DPBaseFragment<layout : ViewBinding, VM : DPBaseViewModel> : Fragment(), DPBaseView {
    open lateinit var binding: layout
    open lateinit var viewModel: VM
    abstract fun initViewModel()
    abstract fun initBinding(container: ViewGroup?): layout
    abstract fun onFragmentCreated()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        initViewModel()
        binding = initBinding(container)
        onFragmentCreated()
        return binding.root
    }

    override fun handleError(error: String?) {
        hideLoader()
        error?.let { showErrorMsg(error) }
    }
    override fun showLoader() {
        //TODO("implement loader first")
    }

    override fun hideLoader() {
        //TODO("implement loader first")
    }

    override fun showSuccessMsg(message: String) {
        Toast.makeText(requireActivity(),message, Toast.LENGTH_LONG)
    }

    override fun showErrorMsg(message: String) {
        Toast.makeText(requireActivity(),message, Toast.LENGTH_LONG)
    }

}