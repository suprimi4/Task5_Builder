package com.example.task5;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class RBuild implements Builder {
    Indicator indicator = new Indicator();

    @Override
    public void buildOne() {
        Circle circle = new Circle();
        circle.setCenterX(100f);
        circle.setCenterY(100f);
        circle.setRadius(50f);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(5f);
        circle.setFill(Color.WHITE);
        indicator.add(circle);

    }

    @Override
    public void buildTwo() {
        Circle circle = new Circle();
        circle.setCenterX(100f);
        circle.setCenterY(100f);
        circle.setRadius(30f);

        circle.setFill(Color.BLUE);
        indicator.add(circle);

    }

    @Override
    public void buildThree() {
        Circle circle = new Circle();
        circle.setCenterX(100f);
        circle.setCenterY(100f);
        circle.setRadius(10f);

        circle.setFill(Color.BLACK);
        indicator.add(circle);

    }

    @Override
    public Indicator build() {
        return indicator;
    }
}

