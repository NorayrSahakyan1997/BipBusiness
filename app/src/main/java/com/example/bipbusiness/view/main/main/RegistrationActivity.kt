package com.example.bipbusiness.view.main.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.bipbusiness.R
import com.example.bipbusiness.model.main.restclient.model.RowChild
import com.example.bipbusiness.presenter.main.MainPresenter
import com.example.bipbusiness.view.main.BaseActivity
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : BaseActivity(), RegistrationView {

    @InjectPresenter
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

    }
    override fun showData(list: List<RowChild>) {
        Log.d("N_TAG",list[0].text)
    }


}
