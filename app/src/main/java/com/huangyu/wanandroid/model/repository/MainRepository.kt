package com.huangyu.wanandroid.model.repository

import ArticleList
import com.huangyu.wanandroid.model.bean.BaseResponse
import com.huangyu.wanandroid.model.network.RetrofitClient

/**
 * Created by huangyu on 2019-09-27.
 */
class MainRepository {

    suspend fun getArticleList(page: Int): BaseResponse<ArticleList> {
        return RetrofitClient.service.getArticles(page)
    }

}