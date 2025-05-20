package net.sf.esfinge.experiment.scenario2green.service;

import net.sf.esfinge.experiment.scenario2green.entity.Article;
import net.sf.esfinge.experiment.scenario2green.repository.ArticleRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArticleService {

    private final ProcessArticlePage processArticlePage = new ProcessArticlePage();
    private final ArticleRepository repository = new ArticleRepository();

    public String findArticle() {
        StringBuilder sb = new StringBuilder();
        List<Article> articles = new ArrayList<>();

        try {
            sb.append("The article ");
            repository.findArticle(sb, articles);
            processArticlePage.calculateQuantityPages(sb, articles);
            sb.append(" has been viewed ");
            repository.findArticleViews(sb);
            sb.append(" times.");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return sb.toString();
    }

    public void saveConsumptionEnergy(boolean saveEnergy) {
        //Implement your logic
    }

}
