
import java.io.Serializable

/**
 * Created by huangyu on 2019-09-27.
 */
data class ArticleList( val offset: Int,
                        val size: Int,
                        val total: Int,
                        val pageCount: Int,
                        val curPage: Int,
                        val over: Boolean,
                        val datas: List<Article>):Serializable