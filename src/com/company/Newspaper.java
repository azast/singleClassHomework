package com.company;

public class Newspaper {

    private String name;
    public String getName() {
        return name;
    }

    private int year;
    public int getYear() {
        return year;
    }

    private int month;
    public int getMonth() {
        return month;
    }

    private int dayOfMonth;
    public int getDayOfMonth() {
        return dayOfMonth;
    }

    private boolean isFinnish;
    public boolean isFinnish() {
        return isFinnish;
    }


    public Newspaper(String name, int year, int month, int dayOfMonth, boolean isFinnish){
        this.name = name;
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.isFinnish = isFinnish;
    }
    public void setDate(int year, int month, int dayOfMonth){
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        //Didn't really know what to write here
    }
    public String toString(){
        return name + ": " + dayOfMonth + "/" + month + "/" + year + " - Is it Finnish: " + isFinnish;
    }
}
