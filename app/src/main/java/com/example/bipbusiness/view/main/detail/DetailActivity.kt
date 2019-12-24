package com.example.bipbusiness.view.main.detail

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.bipbusiness.R
import com.example.bipbusiness.model.main.restclient.model.RowChild
import com.example.bipbusiness.presenter.main.DetailPresenter

class DetailActivity : AppCompatActivity(),DetailView {

    @InjectPresenter
    lateinit var detailPresenter: DetailPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun showData(list: List<RowChild>) {
        Toast.makeText(this,list.size.toString(),Toast.LENGTH_SHORT).show()
    }

    override fun showProgress() {
    }

    override fun hideProgress() {
    }


}
