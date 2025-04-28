package net.sf.esfinge.experiment.scenario2green.repository;

import net.sf.esfinge.experiment.scenario2green.entity.Article;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {

    private static final String FILE_PATH = "src/main/resources/articles.txt";

    public void findArticle(List<Article> param) {
        System.out.println("Method findArticle executed");
        try {
            List<Article> articles = readLinesFile();
            Article article = articles.get(0);
            param.add(article);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
