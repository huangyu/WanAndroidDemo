package com.huangyu.wanandroid.view_model

import ArticleList
import androidx.lifecycle.MutableLiveData
import com.huangyu.wanandroid.model.repository.MainRepository

/**
 * Created by huangyu on 2019-09-27.
 */
class HomeViewModel : BaseViewModel() {

    private val repository by lazy { MainRepository() }

    val articleList: MutableLiveData<ArticleList> = MutableLiveData()

    fun getArticleList(page: Int) {
        launch {
            val response = launchOnIO { repository.getArticleList(page) }
            executeResponse(response, { articleList.value = response.data }, {})
        }
    }

}
