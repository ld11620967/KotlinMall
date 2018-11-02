package com.kotlin.user.ui.activity

import android.os.Bundle
import com.kotlin.base.ui.activity.BaseMvpActivity
import com.kotlin.user.R
import com.kotlin.user.presenter.ReqisterPrensenter
import com.kotlin.user.presenter.view.RegisterView

import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<ReqisterPrensenter>(),RegisterView {
    override fun onRegisterResult(result: Boolean) {
        toast("注册成功")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter = ReqisterPrensenter()
        mPresenter.mView=this

        mRegisterBtn.setOnClickListener {
            mPresenter.register("","")
        }
    }
}
