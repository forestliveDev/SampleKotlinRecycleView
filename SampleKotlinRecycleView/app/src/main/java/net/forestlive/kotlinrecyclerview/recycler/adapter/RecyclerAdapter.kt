package net.forestlive.kotlinrecyclerview.recycler.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import net.forestlive.kotlinrecyclerview.R
import net.forestlive.kotlinrecyclerview.recycler.entity.TriompheEntity
import net.forestlive.kotlinrecyclerview.recycler.holder.BaseRecyclerViewHolder
import net.forestlive.kotlinrecyclerview.recycler.holder.HomeHorseViewDetailHolder
import net.forestlive.kotlinrecyclerview.recycler.manage.TriompheManager

/**
 * Created by ymori on 2017/10/01.
 */

class RecyclerAdapter(private val context: Context, private val itemClickListener: BaseRecyclerViewHolder.ItemClickListener, private val horseList:List<TriompheEntity>)
    : RecyclerView.Adapter<BaseRecyclerViewHolder>() {


    override fun onBindViewHolder(holder: BaseRecyclerViewHolder?, position: Int) {

        (holder as HomeHorseViewDetailHolder).tv_title.text = horseList.get(position).horseName
        (holder as HomeHorseViewDetailHolder).tv_country.text = TriompheManager().countryName(horseList.get(position).country)
    }

    override fun getItemCount(): Int {
        return horseList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BaseRecyclerViewHolder {

        val layoutInflater = LayoutInflater.from(context)
        val viewStartHorse = layoutInflater.inflate(R.layout.ui_home_star_horce, parent, false)

        viewStartHorse.setOnClickListener { view ->
            val imageView = view.findViewById<ImageView>(R.id.im_horse)
            imageView.transitionName = "0"
            itemClickListener.itemClick(0, view, view.findViewById(R.id.im_horse))
        }



        return HomeHorseViewDetailHolder(viewStartHorse)
    }
}
