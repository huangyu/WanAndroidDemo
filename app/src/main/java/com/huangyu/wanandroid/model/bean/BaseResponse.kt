package com.huangyu.wanandroid.model.bean

/**
 * Created by huangyu on 2019-09-27.
 */
data class BaseResponse<out T>(val data: T, val errorCode: Int, val errorMsg: String)