package com.delia.model;

import java.util.List;

/**
 * Created by Delia on 7/7/2015.
 */
public interface CommentDAO {

    public Comment findCommentById(int id);
    public List<Comment> getAllComments();
    public boolean addComment(Comment comment);
}
