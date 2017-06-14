package com.example.salman.test;

/**
 * Created by salman on 6/14/2017.
 */

public class Movie {

    private String title, time, desc;

    public Movie(String title, String desc, String time) {
        this.title = title;
        this.time = time;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
