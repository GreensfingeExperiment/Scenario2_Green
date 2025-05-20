package net.sf.esfinge.experiment.scenario2green.repository;

import net.sf.esfinge.experiment.scenario2green.entity.Article;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {

    private static final String FILE_PATH = "src/main/resources/articles.txt";

    public void findArticle(StringBuilder param, List<Article> articles) throws IOException {
        articles.addAll(readLinesFile());
        param.append(articles.get(0).getName());
    }

    public void findArticleViews(StringBuilder param) throws IOException {
        List<Article> articles = readLinesFile();
        param.append(articles.get(0).getView());
    }

    private List<Article> readLinesFile() throws IOException {
        List<Article> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(";");
                if (fields.length == 2) {
                    list.add(new Article(fields[0], fields[1]));
                }
            }
        }
        return list;
    }
}
