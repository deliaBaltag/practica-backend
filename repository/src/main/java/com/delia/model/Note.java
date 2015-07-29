package com.delia.model;

/**
 * Created by Delia on 7/7/2015.
 */
public class Note {

    //private int id;
    private int nota;

    public  Note()
    {}

    public Note(int nota) {
        //this.id = id;
        this.nota = nota;
    }

    //public Note(int id) {
       // this.id = id;
    //}

    //public int getId() {
       // return id;
    //}

    //public void setId(int id) {
       // this.id = id;
    //}

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
