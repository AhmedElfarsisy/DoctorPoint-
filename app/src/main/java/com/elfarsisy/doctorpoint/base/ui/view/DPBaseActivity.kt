package com.elfarsisy.doctorpoint.base.ui.view

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.elfarsisy.doctorpoint.base.ui.viewmodel.DPBaseViewModel

abstract class DPBaseActivity<layout : ViewBinding, VM : DPBaseViewModel> : AppCompatActivity(),
    DPBaseView {
    open lateinit var binding: layout
    open lateinit var viewModel: VM
    abstract fun initViewModel()
    abstract fun initBinding(): layout
    abstract fun onActivityCreated()
    open fun observeLiveData() {}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
        binding = initBinding()
        setContentView(binding.root)
        onActivityCreated()
        observeLiveData()
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
        Toast.makeText(this, message, Toast.LENGTH_LONG)
    }

    override fun showErrorMsg(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG)
    }

    fun showKeyBoard(view: View) {
        val inputMethodManager =
            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.showSoftInput(view, InputMethodManager.HIDE_IMPLICIT_ONLY)
    }

    fun hideKeyboard() {
        val inputMethodManager =
            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(
            currentFocus?.windowToken,
            InputMethodManager.RESULT_UNCHANGED_SHOWN
        )
    }

}