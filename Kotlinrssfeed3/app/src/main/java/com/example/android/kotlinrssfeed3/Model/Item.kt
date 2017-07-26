package com.example.android.kotlinrssfeed3.Model


/**
 * Created by DIKSHAA SINGHAL on 7/16/2017.
 */
data class Item(val title:String, val pubDate:String, val link:String ,val guid:String, val author:String, val thumbnail:String, val descreiption:String,val content:String, val enclosure:Object , val categories:List<String>)