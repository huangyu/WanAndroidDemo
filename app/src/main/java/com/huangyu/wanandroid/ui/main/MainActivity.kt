package com.huangyu.wanandroid.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.huangyu.wanandroid.R
import com.huangyu.wanandroid.ui.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleList = resources.getStringArray(R.array.tab_title)
        view_pager.adapter = ViewPagerAdapter(this, titleList)
        TabLayoutMediator(tab_layout, view_pager) { tab, position ->
            tab.text = titleList[position]
        }.attach()
    }

}
