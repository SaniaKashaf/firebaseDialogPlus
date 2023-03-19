package com.example.mynew;

public class FOODMODEL {
    String title,url;
    int id;

    public FOODMODEL() {
    }

    public FOODMODEL(String title, String url, int id) {
        this.title = title;
        this.url = url;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}