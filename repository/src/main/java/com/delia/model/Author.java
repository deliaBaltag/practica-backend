package com.delia.model;

/**
 * Created by Delia on 7/7/2015.
 */
public class Author {
    //private int id;
    private String lastName;
    private String firstName;

    public Author()
    {}



    //public Author(int id) {
        //this.id = id;
    //}

    public Author(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    //public int getId() {
        //return id;
    //}

    //public void setId(int id) {
        //this.id = id;
    //}

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
