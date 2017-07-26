package com.example.android.news.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.news.Interface.ItemClickListener;
import com.example.android.news.Model.RSSObject;
import com.example.android.news.R;

import static android.support.v7.recyclerview.R.styleable.RecyclerView;

/**
 * Created by DIKSHAA SINGHAL on 7/25/2017.
 */

class FeedViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener
{

    public TextView txttitle , Pubdate , txtContent ;
    private ItemClickListener itemClickListener;



    public FeedViewHolder(View itemView) {
        super(itemView);
        txttitle = (TextView)itemView.findViewById(R.id.txttitle);
        txtContent = (TextView)itemView.findViewById(R.id.txtContent);
        Pubdate = (TextView)itemView.findViewById(R.id.txtPubdate);
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);

    }
    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }


    @Override
    public void onClick(View v) {

        itemClickListener.onClick(v,getAdapterPosition(),false);


    }

    @Override
    public boolean onLongClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),true);
        return true;
    }
}

public class FeedAdapter extends RecyclerView.Adapter<FeedViewHolder> {

    private RSSObject rssobject;
    private Context mcontext;
    private LayoutInflater inflater;

    public FeedAdapter(RSSObject rssobject, Context mcontext) {
        this.rssobject = rssobject;
        this.mcontext = mcontext;
        inflater = LayoutInflater.from(mcontext);
    }

    @Override
    public FeedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.row,parent,false);
        return new FeedViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FeedViewHolder holder, int position) {



        holder.txttitle.setText((CharSequence) rssobject.getItems().get(position).getTitle());
        holder.Pubdate.setText((CharSequence) rssobject.getItems().get(position).getPubDate());
        holder.txtContent.setText((CharSequence) rssobject.getItems().get(position).getContent());

    }

    @Override
    public int getItemCount() {
        return rssobject.items.size();
    }
}

