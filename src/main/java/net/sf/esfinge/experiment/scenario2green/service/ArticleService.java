package net.sf.esfinge.experiment.scenario2green.service;

import net.sf.esfinge.experiment.scenario2green.repository.ArticleRepository;

public class ArticleService {

    private final ArticleRepository repository = new ArticleRepository();

    public String findQtyArticleView() {
        Integer views = repository.findQtyViews();

        //USE the toggle logic

        return String.format("This article has been viewed %d times.", views);
    }

}
