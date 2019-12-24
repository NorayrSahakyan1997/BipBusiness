package com.example.bipbusiness.view.main


import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.fragment.app.Fragment

class BaseFragment : Fragment(), IBaseView {
    private var mActivity: BaseActivity? = null

    @Override
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is BaseActivity) {
            mActivity = context
        }
    }

    protected fun unbindDrawables(view: View) {
        if (view.background != null) {
            view.background.callback = null
        }
        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                unbindDrawables(view.getChildAt(i))
            }
            if (view !is AdapterView<*>) view.removeAllViews()
        }
    }

    override fun onError(errorMessage: String?) {
        if (mActivity != null) {
            mActivity!!.onError(errorMessage)
        }
    }

    override fun showServerError() {
        if (mActivity != null) {
            mActivity!!.showServerError()
        }
    }

    override fun showNetworkError() {
        if (mActivity != null) {
            mActivity!!.showNetworkError()
        }
    }

    override fun showProgress() {
    }

    override fun hideProgress() {
    }


}