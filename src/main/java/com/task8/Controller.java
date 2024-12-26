package com.task8;

import com.task8.module.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;


public class Controller {
    public Pane pane;

    @FXML
    public void initialize() {
        pane. toFront();
        OsnovaYol tree = new Yolka();
        tree.draw(pane);
    }
    public void addLights (ActionEvent actionEvent) {
        pane.toFront();
        OsnovaYol tree = new Ogonki(new Yolka());
        tree.draw(pane);
    }
    public void addStar (ActionEvent actionEvent) {
        pane.toFront();
        OsnovaYol tree = new Zvezda(new Yolka());
        tree.draw(pane);
    }
    public void addPresent (ActionEvent actionEvent) {
        pane.toFront();
        OsnovaYol tree = new Podarki(new Yolka());
        tree.draw(pane);
    }

    public void addAll(ActionEvent actionEvent) {
        pane.toFront();
        OsnovaYol tree = new Podarki(new Zvezda(new Ogonki(new Yolka())));
        tree.draw(pane);
    }

    public void delete(ActionEvent actionEvent) {
        pane.toFront();
        pane.getChildren().clear();
        OsnovaYol tree = new Yolka();
        tree.draw(pane);
    }

    public void addSG(ActionEvent actionEvent) {
        pane.toFront();
        OsnovaYol tree = new Zvezda(new Ogonki(new Yolka()));
        tree.draw(pane);

    }
}