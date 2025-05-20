package net.sf.esfinge.experiment.scenario2green.service;

import net.sf.esfinge.experiment.scenario2green.entity.Article;

import java.util.List;

public class ProcessArticlePage {

    public void calculateQuantityPages(StringBuilder sb, List<Article> articles) {
        sb.append(" contains ")
            .append(articles.size())
            .append(" pages and");
    }
}
