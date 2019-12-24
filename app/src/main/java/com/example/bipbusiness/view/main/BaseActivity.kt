package com.example.bipbusiness.view.main
import android.annotation.SuppressLint
import android.widget.Toast
import com.example.bipbusiness.view.main.main.BaseAppCompat

@SuppressLint("Registered")
open class BaseActivity : BaseAppCompat(), IBaseView {

    override fun onError(errorMessage: String?) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
    }

    override fun showServerError() {
    }

    override fun showNetworkError() {
    }

    override fun showProgress() {
    }

    override fun hideProgress() {
    }

}