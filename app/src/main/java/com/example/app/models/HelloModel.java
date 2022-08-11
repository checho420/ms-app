package com.example.app.models;

public class HelloModel {
    private String init;
    private String subject;

    public HelloModel(String init, String subject) {
        this.init = init;
        this.subject = subject;
    }

    public HelloModel(){

    }

    public String getInit() {
        return init;
    }

    public void setInit(String init) {
        this.init = init;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
