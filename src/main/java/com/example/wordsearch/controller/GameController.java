package com.example.wordsearch.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class GameController {
    @FXML
    private GridPane gridPaneWordSearch;

    @FXML
    public void initialize(){
        for (int i=0; i<20; i++){
            for (int j=0; j<20; j++){
                Button buttonLetter = new Button();
                gridPaneWordSearch.add(buttonLetter, i, j);
                buttonLetterPressed(buttonLetter, i, j);
            }
        }
    }

    private void buttonLetterPressed(Button buttonLetter, int i, int j){
        buttonLetter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //System.out.println("Button pressed in the position, " + i + " " + j);
            }
        });
    }

}
