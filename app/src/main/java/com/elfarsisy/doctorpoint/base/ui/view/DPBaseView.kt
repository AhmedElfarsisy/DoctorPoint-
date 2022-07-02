package com.elfarsisy.doctorpoint.base.ui.view

interface DPBaseView {
    fun showLoader()
    fun hideLoader()
    fun showErrorMsg(message :String)
    fun showSuccessMsg(message :String)
    fun handleError(error: String?)
}