package com.huangyu.wanandroid.view_model

import SystemParent
import androidx.lifecycle.MutableLiveData
import com.huangyu.wanandroid.model.repository.SystemRepository

/**
 * Created by huangyu on 2019-09-27.
 */
class SystemModel : BaseViewModel() {

    private val repository by lazy { SystemRepository() }

    val systemList: MutableLiveData<SystemParent> = MutableLiveData()

    fun getSystemList() {
        launch {
            val response = launchOnIO { repository.getSystemList() }
            executeResponse(response, { systemList.value = response.data }, {})
        }
    }

}