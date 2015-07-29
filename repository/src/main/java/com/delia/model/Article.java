package com.delia.model;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Delia on 7/7/2015.
 */
@Component
public class Article extends AbstractEntity{

    private Author author;
    private String title;
    private String context;
    private List<Comment> comments;
    private List<Note> notes;

    public Article()
    {

    }

    //public Article(int id) {
        //this.id = id;
    //}

    public Article(Author author) {

        this.author = author;
    }

    //public int getId() {
        //return id;
    //}

    //public void setId(int id) {
        //this.id = id;
    //}

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Article(Author author, String title,String context, List<Comment> comments, List<Note> notes) {
        //this.id = id;
        this.author = author;
        this.title = title;
        this.context=context;
        this.comments = comments;
        this.notes = notes;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void addComment(Comment comment)
    {
        comments.add(comment);
    }


}
