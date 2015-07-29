package com.delia.dao;

import com.delia.model.Article;
import com.delia.model.Author;
import com.delia.model.Comment;

import java.util.List;

/**
 * Created by Delia on 7/10/2015.
 */
public interface ArticleDao {
    public Article findArticleById(String id);
    public List<Article> findArticlesByAuthor(Author author);
    public List<Article> getAllArticles();
    public boolean addArticle(Article article);
    public void deleteArticle(Article article);
    public void saveArticle(Article article);
    public void saveComment(Comment comment);
}
