package com.delia;


import com.delia.dao.ArticleDao;
import com.delia.model.Article;
import com.delia.model.Comment;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Delia on 7/9/2015.
 */

@Controller
@RequestMapping("/articles")
public class ArticleRest {
    @Resource
    //ArticleDAOInMemory article= TangoDaoLocator.getArticleDAOInMemory();
    ArticleDao articleDao;

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    List<Article>  getAllArticles() {
        return articleDao.getAllArticles();

    }


    @RequestMapping(value = "/article/{id}", method = RequestMethod.GET)
    public
    @ResponseBody
    Article getArticleById(@PathVariable String id)
    {
        return articleDao.findArticleById(id);
    }

    @RequestMapping(value = "/{id}/comments", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Comment> getArticleComments(@PathVariable String id)
    {
        return articleDao.findArticleById(id).getComments();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public
    @ResponseBody
    boolean deleteArticleById(@PathVariable String id)
    {
        Article article=articleDao.findArticleById(id);
        if(article!=null)
        {
            articleDao.deleteArticle(article);
            return true;}
        return  false;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public
    @ResponseBody
    Boolean addArticle(@RequestBody Article article) {
        return articleDao.addArticle(article);
    }

    @RequestMapping(value="/article/{id}",method = RequestMethod.POST, consumes = "application/json")
    public
    @ResponseBody
    Boolean addCommentToArticle(@RequestBody Comment comment, @PathVariable String id) {
        Article article2=articleDao.findArticleById(id);
        article2.addComment(comment);

        articleDao.saveArticle(article2);
        return true;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public
    @ResponseBody
    Boolean updateArticle(@PathVariable String id,@RequestBody Article article)
    {
        Article articleUpdate=articleDao.findArticleById(id);
        articleUpdate.setContext(article.getContext());
        articleUpdate.setTitle(article.getTitle());
        articleUpdate.setAuthor(article.getAuthor());
        articleDao.saveArticle(articleUpdate);
        return true;
    }



    @RequestMapping(value = "/{id}/comments/{id1}", method = RequestMethod.GET)
    public
    @ResponseBody
    Comment articleCommentById(@PathVariable String id, @PathVariable String id1)
    {
        return articleDao.findArticleById(id).getComments().get(Integer.parseInt(id1));
    }

    @RequestMapping(value="/{id}/comments",method = RequestMethod.PUT)
    public @ResponseBody boolean addComment(@PathVariable String id , @RequestBody Comment comment){

        Article article = articleDao.findArticleById(id);
        MatureLanguageFilter.replaceMatureWord(comment);
        article.getComments().add(comment);
        articleDao.saveArticle(article);
        return true;
    }

}
