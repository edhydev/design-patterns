package com.edgardev.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Carataker {
    private List<ArticleMemento> states = new ArrayList<>();

    public void addMemento(ArticleMemento memento) {
        states.add(memento);
    }

    public ArticleMemento getMemento(int index) {
        return states.get(index);
    }
}
