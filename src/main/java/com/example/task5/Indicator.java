package com.example.task5;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;

public class Indicator {
    private Pane panel = new Pane();

    public void add(Shape shape){

        panel.getChildren().add(shape);

    }



    public Pane show(){

        return panel;

    }
}
