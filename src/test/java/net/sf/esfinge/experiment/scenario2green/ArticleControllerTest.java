package net.sf.esfinge.experiment.scenario2green;

import net.sf.esfinge.experiment.scenario2green.controller.ArticleController;
import net.sf.esfinge.greenframework.configuration.GreenFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ArticleControllerTest {

    private static final String RECOMMENDATION = "This article has been viewed 542 times.";

    @Test
    void testFindQtyArticleView() {
        ArticleController articleController = GreenFactory.greenify(ArticleController.class);

        String recommendation = articleController.findQtyArticleView();

        assertEquals(RECOMMENDATION, recommendation);
    }

    @Test
    void testFindQtyArticleWithDifferentQtyViews() {
        ArticleController articleController = GreenFactory.greenify(ArticleController.class);
        //Create the green configuration
        String recommendation = articleController.findQtyArticleView();

        assertEquals("", recommendation);
    }

}
