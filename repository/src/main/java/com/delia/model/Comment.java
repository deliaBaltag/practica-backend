package com.delia.model;

/**
 * Created by Delia on 7/7/2015.
 */
public class Comment {

   // private int id;
    private String text;

    public Comment() {
    }

    //public Comment(int id) {
        //this.id = id;
    //}



    public Comment(String text) {
        this.text = text;
    }

    //public int getId() {
        //return id;
    //}

   // public void setId(int id) {
        //this.id = id;
    //}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
