package com;

import java.util.ArrayList;

public class Day {


    public Day() {
    }

    public Day(ArrayList<Lesson> lessons, String date) {
        this.lessons = lessons;
        this.date = date;
    }


    private Integer id;
    private ArrayList<Lesson> lessons;
    private String date;



    public Integer getId() {
        return id;
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
