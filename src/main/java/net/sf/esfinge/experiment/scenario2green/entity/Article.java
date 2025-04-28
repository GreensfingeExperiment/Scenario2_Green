package net.sf.esfinge.experiment.scenario2green.entity;

public class Article {

    public Article(String view, String name) {
        this.name = name;
        this.view = Integer.valueOf(view);
    }

    private Integer view;
    private String name;

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
