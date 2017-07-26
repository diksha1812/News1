package com.example.android.kotlinrssfeed3.Adaptor

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.example.android.kotlinrssfeed3.R


/**
 * Created by DIKSHAA SINGHAL on 7/16/2017.
 */
class FeedViewHolder(itemView: View):RecyclerView.ViewHolder(itemView),View.OnClickListener,View.OnLongClickListener {

var txtTitle:TextView
    var txtPubdate:TextView
    var txtContent:TextView

     var itemClickListener : ItemClickListener =? null


    init {
        txtTitle = itemView.findViewById(R.id.txtTitle) as TextView
        txtPubdate = itemView.findViewById(R.id.txtPubdate) as TextView
        txtContent = itemView.findViewById(R.id.txtContent) as TextView
    }











    override fun onLongClick(v: View?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}