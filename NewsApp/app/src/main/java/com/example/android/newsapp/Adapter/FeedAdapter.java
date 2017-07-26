package com.example.android.newsapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.android.newsapp.Interface.ItemClickListener;

/**
 * Created by DIKSHAA SINGHAL on 7/24/2017.
 */


class FeedViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener {


    public TextView txttitle , Pubdate , txtContent ;
    private ItemClickListener itemClickListener;

    public FeedViewHolder(View itemView) {
        super(itemView);
        txttitle = (TextView)itemView.findViewById(R.id.txtTitle);
        txtContent = (TextView)itemView.findViewById(R.id.txtContent);
        Pubdate = (TextView)itemView.findViewById(R.id.Pubdate);
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onLongClick(View view) {
        return false;
    }
}


public class FeedAdapter {




}
