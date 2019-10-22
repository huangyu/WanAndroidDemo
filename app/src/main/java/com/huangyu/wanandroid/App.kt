package com.huangyu.wanandroid

import android.app.Application
import android.content.Context
import com.blankj.utilcode.util.Utils
import kotlin.properties.Delegates

/**
 * Created by huangyu on 2019-09-26.
 */
class App : Application() {

    companion object {
        var context: Context by Delegates.notNull()
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext

        Utils.init(context)
    }

}
