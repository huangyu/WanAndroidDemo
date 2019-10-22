package com.huangyu.wanandroid.view

import com.chad.library.adapter.base.loadmore.LoadMoreView
import com.huangyu.wanandroid.R

/**
 * Created by huangyu on 2019-09-27.
 */
class CustomLoadMoreView : LoadMoreView() {

    override fun getLayoutId(): Int {
        return R.layout.view_load_more
    }

    override fun getLoadingViewId(): Int {
        return R.id.load_more_loading_view
    }

    override fun getLoadFailViewId(): Int {
        return R.id.load_more_load_fail_view
    }

    override fun getLoadEndViewId(): Int {
        return R.id.load_more_load_end_view
    }

}