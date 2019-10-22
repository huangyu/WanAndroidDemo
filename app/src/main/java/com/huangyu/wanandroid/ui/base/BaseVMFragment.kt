package com.huangyu.wanandroid.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.huangyu.wanandroid.view_model.BaseViewModel

/**
 * Created by huangyu on 2019-09-27.
 */
abstract class BaseVMFragment<VM : BaseViewModel> : androidx.fragment.app.Fragment() {

    protected lateinit var viewModel: VM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayoutResId(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initVM()
        initView()
        initData()
        startObserve()
        super.onViewCreated(view, savedInstanceState)
    }

    open fun startObserve() {
        viewModel.exception.observe(this, Observer { it?.let { onError(it) } })
    }

    private fun initVM() {
        providerVMClass()?.let {
            viewModel = ViewModelProvider(this).get(it)
            lifecycle.addObserver(viewModel)
        }
    }

    override fun onDestroy() {
        lifecycle.removeObserver(viewModel)
        super.onDestroy()
    }

    open fun providerVMClass(): Class<VM>? = null

    open fun onError(e: Throwable) {}

    abstract fun getLayoutResId(): Int

    abstract fun initView()

    abstract fun initData()


}