package com.example.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.net.DatagramSocket;

public class HelloController {
    public Button activeBut;
    public Pane panel;




    public void onActive(ActionEvent actionEvent) {
        RBuild rbuild = new RBuild();
        rbuild.buildOne();
        rbuild.buildTwo();
        rbuild.buildThree();
        panel.getChildren().add(rbuild.build().show());

    }
}