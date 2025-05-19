package net.sf.esfinge.experiment.scenario2green;

import net.sf.esfinge.experiment.scenario2green.entity.Article;
import net.sf.esfinge.experiment.scenario2green.service.ArticleService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArticleServiceTest {

    @Test
    void testFindQtyArticleView() {
        ArticleService articleService = new ArticleService();

        List<Article> articles = new ArrayList<>();
        articleService.findArticles(articles);

        assertEquals(1, articles.size());
        assertEquals("Como fazer um bolo simples", articles.get(0).getName());
        assertEquals(45, articles.get(0).getView());
    }

    @Test
    void testFindQtyArticleUsingGreenFramework() {
        ArticleService articleService = new ArticleService();

        List<Article> articles = new ArrayList<>();
        articleService.findArticles(articles);

        assertEquals(0, articles.size());
    }


}
