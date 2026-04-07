package pe.edu.upeu.controller;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

public class MainController {
    @FXML
    TextField txtNum1, txtNum2;

    @FXML
    Button btnSuma, btnResta, btnMultiplicacion, btnDividir;

    @FXML
    Label txtresult;

    @FXML
    public void initialize() {

        btnSuma.setOnAction(actionEvent -> {
            double result = Double.parseDouble(txtNum1.getText()) + Double.parseDouble(txtNum2.getText());
            txtresult.setText(String.valueOf(result));
        });
        btnResta.setOnAction(e -> {
            double result = Double.parseDouble(txtNum1.getText()) - Double.parseDouble(txtNum2.getText());
            txtresult.setText(String.valueOf(result));
        });

        btnMultiplicacion.setOnAction(e -> {
            double result = Double.parseDouble(txtNum1.getText()) * Double.parseDouble(txtNum2.getText());
            txtresult.setText(String.valueOf(result));
        });

        btnDividir.setOnAction(e -> {
            double result = Double.parseDouble(txtNum1.getText()) / Double.parseDouble(txtNum2.getText());
            txtresult.setText(String.valueOf(result));
        });
    }
}

