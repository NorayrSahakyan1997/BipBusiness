package com.example.bipbusiness.presenter.main
import android.annotation.SuppressLint
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.bipbusiness.model.main.restclient.MainComponent
import com.example.bipbusiness.view.main.main.RegistrationView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@InjectViewState
class MainPresenter: MvpPresenter<RegistrationView>() {

    val mainComponent: MainComponent = MainComponent()

    @SuppressLint("CheckResult")
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.showProgress()
        mainComponent
                .getLanguages()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ response ->
                    viewState.showData(response.data.listUsers)
                    viewState.hideProgress()
                }, { error ->
                    error.printStackTrace()
                    viewState.onError(error.message)
                    viewState.hideProgress()
                })

    }
}