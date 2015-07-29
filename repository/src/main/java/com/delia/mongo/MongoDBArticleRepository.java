package com.delia.mongo;


import com.delia.dao.ArticleDao;
import com.delia.model.Article;
import com.delia.model.Author;
import com.delia.model.Comment;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

/**
 * Created by Delia on 7/10/2015.
 */
@Repository
public class MongoDBArticleRepository implements ArticleDao{

    @Resource
    private MongoOperations operations;

    public Article findArticleById(String id) {
        Query query = query(where("_id").is(new ObjectId(id)));
        return operations.findOne(query, Article.class);
    }

    public List<Article> findArticlesByAuthor(Author author) {
        Query query = query(where("author").is(author));
        return operations.find(query, Article.class);
    }

    public List<Article>  getAllArticles() {
        return operations.findAll(Article.class);
    }

    public boolean addArticle(Article article) {
        operations.save(article);
        return true;
    }

    public void deleteArticle(Article article)
    {
        operations.remove(article);
    }

    public void saveArticle(Article article)
    {
        operations.save(article);

    }

    public void saveComment(Comment comment)
    {
        operations.save(comment);

    }
}
