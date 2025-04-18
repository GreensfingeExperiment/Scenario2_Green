package net.sf.esfinge.experiment.scenario2green;

import net.sf.esfinge.experiment.scenario2green.entity.Article;
import net.sf.esfinge.experiment.scenario2green.service.ArticleService;
import net.sf.esfinge.greenframework.configuration.GreenFactory;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ArticleServiceTest {

    @Test
    void testFindQtyArticleView() {
        ArticleService articleService = new ArticleService();

        List<Article> articles = new ArrayList<>();
        articleService.findArticles(articles);

        assertEquals(3, articles.size());
    }

    @Test
    void testFindQtyArticleUsingGreenFramework() {
        ArticleService articleService = GreenFactory.greenify(ArticleService.class);

        //Create the green configuration
        List<Article> articles = new ArrayList<>();
        articleService.findArticles(articles);

        assertNotEquals(3, articles.size());
    }

}
