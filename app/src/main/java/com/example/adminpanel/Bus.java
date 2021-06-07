package com.example.adminpanel;

public class Bus {
    private String name;
    private String from;
    private String to;
    private String time;

    public Bus()
    {

    }

    public Bus(String name, String from, String to, String time){

        this.name = name;
        this.from = from;
        this.to = to;
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setTime(String time) { this.time = time; }



    public String getName() {
        return name;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getTime() { return time; }

}

