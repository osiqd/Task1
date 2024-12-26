package com.task8.module;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Podarki extends Decorac {
    public Podarki(OsnovaYol tree) {
        super (tree);
    }
    public void draw (Pane pane) {
        super.draw(pane);
        drawWithPresent (pane);
    }
    private void drawWithPresent (Pane pane) {
        Rectangle present1 = new Rectangle();
        present1. setX(115);
        present1. setY (370);
        present1. setWidth(70);
        present1. setHeight (70);
        present1. setArcWidth(20);
        present1. setArcHeight (20);
        present1. setFill (Color. BLUE);
        Rectangle present2 = new Rectangle();
        present2. setX(320);
        present2. setY (400);
        present2. setWidth(80);
        present2. setHeight (80);
        present2. setFill (Color. DARKGREY);
        Rectangle present3 = new Rectangle();
        present3. setX(320);
        present2. setY (369);
        present2. setWidth(50);
        present2. setHeight (50);
        present2. setFill (Color. RED);

        pane. getChildren(). addAll (present1, present2, present3);
    }
}

