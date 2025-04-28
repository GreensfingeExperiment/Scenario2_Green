package net.sf.esfinge.experiment.scenario2green.service;

import net.sf.esfinge.experiment.scenario2green.entity.Article;
import net.sf.esfinge.experiment.scenario2green.repository.ArticleRepository;

import java.util.List;

public class ArticleService {

    private final ArticleRepository repository = new ArticleRepository();

    public void findArticles(List<Article> param) {
        repository.findArticle(param);
    }

}
