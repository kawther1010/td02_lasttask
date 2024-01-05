package com.example.lasttask;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public void start(Stage primaryStage) {
        HBox rootTop= new HBox();
        Button b1 = new Button("B1");
        Button b2 = new Button("B2");
        Button b3 = new Button("B3");
        Button b4 = new Button("B4");
        rootTop.setAlignment(Pos.TOP_CENTER);
        rootTop.setPadding(new Insets(5));//pour définir l'espace (marge) entre le bord du conteneur et les composants enfants
        rootTop.setSpacing(5); //pour définir l'espace entre les composants enfants
        rootTop.getChildren().addAll(b1,b2,b3,b4);

        GridPane rootCentre = new GridPane();
        rootCentre.setPrefSize(400, 400);//setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        //rootCentre.setPadding(new Insets(5, 0, 5, 0));
        rootCentre.setAlignment(Pos.TOP_CENTER);
        Button bgr1 = new Button("GR1");
        Button bgr2 = new Button("GR2");
        Button bgr3 = new Button("GR3");
        Button bgr4 = new Button("GR4");
        GridPane.setValignment(bgr1, VPos.CENTER);
        GridPane.setValignment(bgr2, VPos.CENTER);
        GridPane.setValignment(bgr3, VPos.CENTER);
        GridPane.setValignment(bgr4, VPos.CENTER);
        bgr1.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        bgr2.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        bgr3.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        bgr4.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        rootCentre.setHgrow(bgr1,Priority.ALWAYS);
        rootCentre.setHgrow(bgr2,Priority.ALWAYS);
        rootCentre.setHgrow(bgr3,Priority.ALWAYS);
        rootCentre.setHgrow(bgr4,Priority.ALWAYS);
        rootCentre.setVgrow(bgr1,Priority.ALWAYS);
        rootCentre.setVgrow(bgr2,Priority.ALWAYS);
        rootCentre.setVgrow(bgr3,Priority.ALWAYS);
        rootCentre.setVgrow(bgr4,Priority.ALWAYS);
        rootCentre.add(bgr1, 0, 0);
        rootCentre.add(bgr2, 1, 0);
        rootCentre.add(bgr3, 0, 1);
        rootCentre.add(bgr4, 1, 1);
        HBox rootBottom = new HBox();
        rootBottom.setAlignment(Pos.TOP_CENTER);
        ComboBox combobox =new ComboBox();
        TextField tex=new TextField("Un texte");
        rootBottom.getChildren().addAll(combobox ,tex);
        BorderPane root =new BorderPane();
        root.setTop(rootTop);
        root.setCenter(rootCentre);
        root.setBottom(rootBottom);
        Scene scene = new Scene(root, 250, 150);
        primaryStage.setTitle("Layouts");
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}