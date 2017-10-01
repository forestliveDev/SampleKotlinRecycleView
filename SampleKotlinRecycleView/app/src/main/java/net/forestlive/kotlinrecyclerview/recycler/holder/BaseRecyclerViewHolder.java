package net.forestlive.kotlinrecyclerview.recycler.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by ymori on 2017/09/18.
 */

public class BaseRecyclerViewHolder extends RecyclerView.ViewHolder {

    public interface ItemClickListener {
        void itemClick(int position, View view, View animationImg);
    }



    public BaseRecyclerViewHolder(View itemView) {
        super(itemView);
    }
}
