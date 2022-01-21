package com.edgardev.behavioral.memento;

public class MainMemento {
    public static void main(String[] args) {
        Carataker carataker = new Carataker();
        Article article = new Article("Edgar", "Memento es la pelicula");
        article.setText(article.getText() + "  de Marvel");
        System.out.println(article.getText());

        carataker.addMemento(article.createMemento());
        article.setText(article.getText() + " protagonizada por Jhon Davis");
        System.out.println(article.getText());

        carataker.addMemento(article.createMemento());

        article.setText(article.getText() + " y Leonardo DiCaprio");

        ArticleMemento memento1 = carataker.getMemento(0);
        ArticleMemento memento2 = carataker.getMemento(1);

        article.restoreMemento(memento1);
        System.out.println(article.getText());

        article.restoreMemento(memento2);
        System.out.println(article.getText());

        article.setText(article.getText() + "del año 2021");
    }
}
