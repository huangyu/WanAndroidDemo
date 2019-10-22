package com.huangyu.wanandroid.ui.adapter

import Article
import android.os.Build
import android.text.Html
import android.text.TextUtils
import android.view.View
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.huangyu.wanandroid.R

/**
 * Created by huangyu on 2019-09-27.
 */
class HomeArticleAdapter(layoutResId: Int = R.layout.item_article) :
    BaseQuickAdapter<Article, BaseViewHolder>(layoutResId) {

    override fun convert(helper: BaseViewHolder, item: Article) {
        helper.setText(
            R.id.tv_title,
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                Html.fromHtml(item.title, Html.FROM_HTML_MODE_LEGACY)
            } else {
                Html.fromHtml(item.title)
            }
        )
            .setText(R.id.tv_author, item.author)
            .setText(R.id.tv_time, item.niceDate)
        val author = item.author
        if (TextUtils.isEmpty(author)) {
            helper.setVisible(R.id.iv_author, false)
            helper.setVisible(R.id.tv_author, false)
        } else {
            helper.setVisible(R.id.iv_author, true)
            helper.setVisible(R.id.tv_author, true)
        }
    }

}