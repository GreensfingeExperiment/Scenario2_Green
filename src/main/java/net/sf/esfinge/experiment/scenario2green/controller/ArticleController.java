package net.sf.esfinge.experiment.scenario2green.controller;

import net.sf.esfinge.experiment.scenario2green.service.ArticleService;

public class ArticleController {

    //Add the green annotation configuration
    private final ArticleService service = new ArticleService();

    public String findQtyArticleView() {
        return service.findQtyArticleView();
    }

}
