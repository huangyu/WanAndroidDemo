package com.huangyu.wanandroid.ui.adapter

import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.huangyu.wanandroid.ui.home.HomeFragment
import com.huangyu.wanandroid.ui.navigation.NavigationFragment
import com.huangyu.wanandroid.ui.project.ProjectFragment
import com.huangyu.wanandroid.ui.system.SystemFragment

/**
 * Created by huangyu on 2019-09-27.
 */
class ViewPagerAdapter(@NonNull fragmentActivity: FragmentActivity, private val titleList: Array<String>) :
    FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 -> {
                SystemFragment()
            }
            2 -> {
                NavigationFragment()
            }
            else -> {
                ProjectFragment()
            }
        }
    }

    override fun getItemCount(): Int {
        return titleList.size
    }

}
