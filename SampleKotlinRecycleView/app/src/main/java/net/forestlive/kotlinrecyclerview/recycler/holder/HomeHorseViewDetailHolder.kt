package net.forestlive.kotlinrecyclerview.recycler.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView

import net.forestlive.kotlinrecyclerview.R


/**
 * Created by ymori on 2017/09/27.
 */

class HomeHorseViewDetailHolder(view: View) : BaseRecyclerViewHolder(view) {

    /**
     * 使用しているレイアウトxml
     * 　ui_home_star_horce.xml
     */

    val im_horce: ImageView = view.findViewById(R.id.im_horse)
    val tv_image_name: TextView = view.findViewById(R.id.tv_image_name)
    val tv_title: TextView = view.findViewById(R.id.tv_title)
    val tv_country: TextView = view.findViewById(R.id.tv_country)

    init {
        // layoutの初期を設定する

    }
}
