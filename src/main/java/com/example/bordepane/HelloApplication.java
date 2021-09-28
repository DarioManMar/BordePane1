package com.example.bordepane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage Stage) throws Exception {
        BorderPane root = new BorderPane();

        root.setPadding(new Insets(15, 20, 10, 10));

        // TOP
        Button btnTop = new Button("Top");
        btnTop.setPadding(new Insets(10, 10, 10, 10));
        root.setTop(btnTop);
        // Cambiar margen top
        BorderPane.setMargin(btnTop, new Insets(10, 10, 10, 10));
        BorderPane.setAlignment(btnTop, Pos.TOP_CENTER);
        btnTop.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        // LEFT
        Button btnLeft = new Button("Left");
        btnLeft.setPadding(new Insets(5, 5, 5, 5));
        root.setLeft(btnLeft);
        // Cambiar margen left
        BorderPane.setMargin(btnLeft, new Insets(10, 10, 10, 10));
        btnLeft.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        // CENTER
        Button btnCenter = new Button("Center");
        btnCenter.setPadding(new Insets(5, 5, 5, 5));
        root.setCenter(btnCenter);
        // Alineacion
        BorderPane.setAlignment(btnCenter, Pos.BOTTOM_CENTER);
        btnCenter.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        // BOTTOM
        Button btnBottom = new Button("Bottom");
        btnBottom.setPadding(new Insets(5, 5, 5, 5));
        root.setBottom(btnBottom);
        // Alineacion
        BorderPane.setAlignment(btnBottom, Pos.TOP_LEFT);
        btnBottom.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        // Cambiar margen bot
        BorderPane.setMargin(btnBottom, new Insets(10, 10, 10, 10));

        Scene scene = new Scene(root, 550, 250);

        Stage.setTitle("BorderPaneDarioPrueba");
        Stage.setScene(scene);
        Stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}