package com.example.kointest.presenter.main

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.kointest.model.main.restclient.MainComponent
import com.example.kointest.view.main.MainView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@InjectViewState
class MainPresenter: MvpPresenter<MainView>() {

    val mainComponent: MainComponent = MainComponent()

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.showProgress()

        mainComponent
                .getUsers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ response ->
                    viewState.showData("Everything is nice")

                    viewState.hideProgress()
                }, { error ->
                    error.printStackTrace()

                    viewState.hideProgress()
                })
    }
}