import luyao.wanandroid.model.bean.SystemChild
import java.io.Serializable

/**
 * Created by huangyu on 2019-09-27.
 */
data class SystemParent(
    val children: List<SystemChild>,
    val courseId: Int,
    val id: Int,
    val name: String,
    val order: Int,
    val parentChapterId: Int,
    val visible: Int,
    val userControlSetTop: Boolean
) : Serializable