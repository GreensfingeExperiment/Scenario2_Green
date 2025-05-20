package net.sf.esfinge.experiment.scenario2green;

import net.sf.esfinge.experiment.scenario2green.service.ArticleService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArticleServiceTest {

    private static final String ARTICLE = "The article Como fazer um bolo simples contains 10 pages and has been viewed 45 times.";
    private static final String SAVE_ENERGY_ARTICLE = "The article Como fazer um bolo simples has been viewed 45 times.";

    @Test
    void testFindArticleView() {
        ArticleService articleService = new ArticleService();

        String titleArticle = articleService.findArticle();

        assertEquals(ARTICLE, titleArticle);
    }

    @Test
    void testFindArticleUsingLogic() {
        ArticleService articleService = new ArticleService();
        articleService.saveConsumptionEnergy(true);

        String titleArticle = articleService.findArticle();

        assertEquals(SAVE_ENERGY_ARTICLE, titleArticle);
    }


}
