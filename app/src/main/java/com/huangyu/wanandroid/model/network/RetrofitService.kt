package com.huangyu.wanandroid.model.network

import ArticleList
import SystemParent
import com.huangyu.wanandroid.model.bean.BaseResponse
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by huangyu on 2019-09-27.
 */
interface RetrofitService {

    companion object {
        const val BASE_URL = "https://www.wanandroid.com"
    }

    @GET("/article/list/{page}/json")
    suspend fun getArticles(@Path("page") page: Int): BaseResponse<ArticleList>

    @GET("tree/json")
    suspend fun getSystems(): BaseResponse<SystemParent>

}
