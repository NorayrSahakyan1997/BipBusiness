package com.example.bipbusiness.view.main.detail
import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.bipbusiness.model.main.restclient.model.RowChild

@StateStrategyType(AddToEndSingleStrategy::class)
interface DetailView: MvpView {

    fun showData(list:List<RowChild>)

    fun showProgress()

    fun hideProgress()

}