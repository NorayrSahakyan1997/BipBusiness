package com.example.bipbusiness.presenter.main

import android.annotation.SuppressLint
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.bipbusiness.model.main.restclient.MainComponent
import com.example.bipbusiness.view.main.detail.DetailView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@InjectViewState
class DetailPresenter: MvpPresenter<DetailView>() {
    val mainComponent: MainComponent = MainComponent()

    @SuppressLint("CheckResult")
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.showProgress()

        mainComponent
                .getDetials()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ response ->
                    viewState.showData(response.data.listUsers)
                    viewState.hideProgress()
                }, { error ->
                    error.printStackTrace()
                    viewState.hideProgress()
                })
    }
}