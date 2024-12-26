package com.task8.module;

import javafx.scene.layout.Pane;

public class Decorac implements OsnovaYol {
    private OsnovaYol tree;

    public Decorac(OsnovaYol tree) {
        this.tree = tree;
    }

    @Override
    public void draw(Pane pane) {
        tree.draw(pane);
    }
}
