package com.huangyu.wanandroid.ui.home

import ArticleList
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.huangyu.wanandroid.R
import com.huangyu.wanandroid.ui.adapter.HomeArticleAdapter
import com.huangyu.wanandroid.ui.base.BaseVMFragment
import com.huangyu.wanandroid.view.CustomLoadMoreView
import com.huangyu.wanandroid.view_model.HomeViewModel
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by huangyu on 2019-09-27.
 */
class HomeFragment : BaseVMFragment<HomeViewModel>() {

    private val homeArticleAdapter by lazy { HomeArticleAdapter() }

    private var currentPage = 0

    override fun providerVMClass(): Class<HomeViewModel>? = HomeViewModel::class.java

    override fun getLayoutResId(): Int {
        return R.layout.fragment_home
    }

    override fun initView() {
        recycle_view.apply {
            layoutManager = LinearLayoutManager(activity)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
        swipe_refresh_layout.apply {
            setOnRefreshListener { refresh() }
        }

        initAdapter()
    }

    override fun initData() {
        viewModel.getArticleList(0)
    }

    private fun initAdapter() {
        homeArticleAdapter.apply {
            setLoadMoreView(CustomLoadMoreView())
            setOnLoadMoreListener({ loadMore() }, recycle_view)
        }
        recycle_view.adapter = homeArticleAdapter
    }

    private fun refresh() {
        homeArticleAdapter.setEnableLoadMore(false)
        swipe_refresh_layout.isRefreshing = true
        currentPage = 0
        viewModel.getArticleList(currentPage)
    }

    private fun loadMore() {
        viewModel.getArticleList(currentPage)
    }

    override fun startObserve() {
        super.startObserve()
        viewModel.apply {
            articleList.observe(this@HomeFragment, Observer { it ->
                it?.let { setArticles(it) }
            })
        }
    }

    private fun setArticles(articleList: ArticleList) {
        homeArticleAdapter.apply {
            if (swipe_refresh_layout.isRefreshing) {
                replaceData(articleList.datas)
            } else {
                addData(articleList.datas)
            }
            setEnableLoadMore(true)
            loadMoreComplete()
        }
        swipe_refresh_layout.isRefreshing = false
        currentPage++
    }

}