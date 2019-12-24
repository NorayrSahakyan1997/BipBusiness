package com.example.bipbusiness.view.main

import com.arellomobile.mvp.MvpView

interface IBaseView: MvpView {
    fun onError(errorMessage: String?)
    fun showServerError()
    fun showNetworkError()
    fun showProgress()
    fun hideProgress()
}