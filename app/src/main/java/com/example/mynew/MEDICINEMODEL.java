package com.example.mynew;

public class MEDICINEMODEL {

    String body,title;
    int id;

    public MEDICINEMODEL() {
    }

    public MEDICINEMODEL(String body, String title, int id) {
        this.body = body;
        this.title = title;
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
