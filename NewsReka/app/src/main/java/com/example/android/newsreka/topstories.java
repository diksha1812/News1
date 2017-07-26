package com.example.android.newsreka;

/**
 * Created by DIKSHAA SINGHAL on 7/23/2017.
 */

public class topstories {

    private String heading;
    private String descp;
    private String shortdescp;
    private String time;
    private String date;
    private int imgid;
    private String url;


    public topstories(String heading, String descp, String shortdescp, String time, String date, int imgid, String url) {
        this.heading = heading;
        this.descp = descp;
        this.shortdescp = shortdescp;
        this.time = time;
        this.date = date;
        this.imgid = imgid;
        this.url = url;
    }

    public String getHeading() {
        return heading;
    }

    public String getDescp() {
        return descp;
    }

    public String getShortdescp() {
        return shortdescp;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public int getImgid() {
        return imgid;
    }

    public String getUrl() {
        return url;
    }
}
