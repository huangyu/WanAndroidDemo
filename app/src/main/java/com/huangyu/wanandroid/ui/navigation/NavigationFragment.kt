package com.huangyu.wanandroid.ui.navigation

import com.huangyu.wanandroid.R
import com.huangyu.wanandroid.ui.base.BaseVMFragment
import com.huangyu.wanandroid.view_model.NavigationViewModel

/**
 * Created by huangyu on 2019-09-27.
 */
class NavigationFragment : BaseVMFragment<NavigationViewModel>() {

    override fun providerVMClass(): Class<NavigationViewModel>? = NavigationViewModel::class.java

    override fun getLayoutResId(): Int {
        return R.layout.fragment_navigation
    }

    override fun initView() {

    }

    override fun initData() {

    }

}