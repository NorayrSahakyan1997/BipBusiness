package com.example.bipbusiness.view.main.main
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.bipbusiness.model.main.restclient.model.RowChild
import com.example.bipbusiness.view.main.IBaseView

@StateStrategyType(AddToEndSingleStrategy::class)
interface RegistrationView: IBaseView {
    fun showData(list:List<RowChild>)
}