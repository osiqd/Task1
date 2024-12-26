package com.task8.module;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Ogonki extends Decorac {
    public Circle[] circle = new Circle[9];
    public Ogonki(OsnovaYol tree){
        super(tree);
    }

    @Override
    public void draw(Pane pane) {
        super.draw(pane);
        drawWithGirland(pane);
    }
    private void drawWithGirland(Pane pane)
    {
        FadeTransition[] ft = new FadeTransition[9];
        circle[0] = new Circle(210, 200, 10, Color.RED);
        circle[1] = new Circle(270, 200, 10, Color.BLUE);
        circle[2] = new Circle(240, 150, 10, Color.WHITE);
        circle[3] = new Circle(180, 260, 10, Color.YELLOW);
        circle[4] = new Circle(240, 260, 10, Color.RED);
        circle[5] = new Circle(300, 260, 10, Color.BLUE);
        circle[6] = new Circle(145, 340, 10, Color.WHITE);
        circle[7] = new Circle(240, 340, 10, Color.YELLOW);
        circle[8] = new Circle(335, 340, 10, Color.RED);

        for (int i =0; i < ft.length; i++)
        {
            ft[i] = new FadeTransition(Duration.millis(1000), circle[i]);
            ft[i].setFromValue(1.0);
            ft[i].setToValue(0.0);
            ft[i].setCycleCount(Timeline.INDEFINITE);
            ft[i].setAutoReverse(true);
            ft[i].play();
        }
        pane.getChildren().addAll(circle[0], circle[1], circle[2], circle[3], circle[4], circle[5], circle[6], circle[7], circle[8]);
    }
}
