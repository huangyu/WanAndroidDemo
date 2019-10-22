package com.huangyu.wanandroid.model.repository

import SystemParent
import com.huangyu.wanandroid.model.bean.BaseResponse
import com.huangyu.wanandroid.model.network.RetrofitClient

/**
 * Created by huangyu on 2019/10/22.
 */
class SystemRepository {

    suspend fun getSystemList(): BaseResponse<SystemParent> {
        return RetrofitClient.service.getSystems()
    }

}