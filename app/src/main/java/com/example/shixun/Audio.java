package com.example.shixun;

public class Audio {
    private String name;
    private String date;
    private long time;
    private String path;
    private boolean stata;

    public Audio(String name, String date, long time, String path, boolean stata) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.path = path;
        this.stata = stata;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isStata() {
        return stata;
    }

    public void setStata(boolean stata) {
        this.stata = stata;
    }
}
