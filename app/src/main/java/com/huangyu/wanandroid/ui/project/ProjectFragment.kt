package com.huangyu.wanandroid.ui.project

import com.huangyu.wanandroid.R
import com.huangyu.wanandroid.ui.base.BaseVMFragment
import com.huangyu.wanandroid.view_model.ProjectViewModel

/**
 * Created by huangyu on 2019-09-27.
 */
class ProjectFragment : BaseVMFragment<ProjectViewModel>() {

    override fun providerVMClass(): Class<ProjectViewModel>? = ProjectViewModel::class.java

    override fun getLayoutResId(): Int {
        return R.layout.fragment_project
    }

    override fun initView() {

    }

    override fun initData() {

    }

}