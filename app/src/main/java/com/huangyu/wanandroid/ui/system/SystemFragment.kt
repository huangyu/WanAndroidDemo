package com.huangyu.wanandroid.ui.system

import com.huangyu.wanandroid.R
import com.huangyu.wanandroid.ui.base.BaseVMFragment
import com.huangyu.wanandroid.view_model.SystemModel

/**
 * Created by huangyu on 2019-09-27.
 */
class SystemFragment : BaseVMFragment<SystemModel>() {

    override fun providerVMClass(): Class<SystemModel>? = SystemModel::class.java

    override fun getLayoutResId(): Int {
        return R.layout.fragment_system
    }

    override fun initView() {

    }

    override fun initData() {

    }

}