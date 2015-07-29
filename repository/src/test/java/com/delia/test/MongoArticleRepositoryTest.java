package com.delia.test;

import com.delia.ApplicationConfig;
import com.delia.dao.ArticleDao;
import com.delia.model.Article;
import com.delia.model.Author;


import com.delia.model.Comment;
import com.delia.model.Note;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Delia on 7/10/2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class MongoArticleRepositoryTest {

    @Resource
    ArticleDao articleDao;

    @Test
    public void testSaveArticle() {
        //Author author = authorRepository.findAll().get(0);
        Author author=new Author("Delia","Baltag");
        List<Comment> listComments=new ArrayList<Comment>();
        listComments.add(new Comment("comment0"));
        List<Note> listNotes=new ArrayList<Note>();
        listNotes.add(new Note(9));
        Article article = new Article();
        article.setAuthor(author);
        article.setComments(listComments);
        article.setContext("articooool test");
        article.setTitle("Articol0");
        article.setNotes(listNotes);

        //if (author != null) {
         //   article.addAuthor(author);
        //}

        articleDao.addArticle(article);

        Article actual = articleDao.findArticleById(article.getId());

        assertEquals(article.getTitle(), actual.getTitle());
    }

}
