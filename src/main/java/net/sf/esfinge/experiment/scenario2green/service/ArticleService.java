package net.sf.esfinge.experiment.scenario2green.service;

import net.sf.esfinge.experiment.scenario2green.entity.Article;

import java.util.List;

public class ArticleService {

    //Use the Annotation like the example documentation
    public void findArticles(List<Article> param) {
        param.add(new Article(50, "Article1"));
        param.add(new Article(53, "Article2"));
        param.add(new Article(2, "Article3"));
    }

}
