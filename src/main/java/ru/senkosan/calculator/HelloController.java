package ru.senkosan.calculator;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    public Label label;
    @FXML
    public Button btn1;
    @FXML
    public Button btn2;
    @FXML
    public Button btn3;
    @FXML
    public Button btnplus;
    @FXML
    public Button btnotr;
    @FXML
    public Button btn0;

    @FXML
    public Button btnpoint;
    @FXML
    public Button btnEquials;
    @FXML
    public Button btnPercent;
    @FXML
    public Button btnClear;
    @FXML
    public Button btnBackShift;
    @FXML
    public Button btn7;
    @FXML
    public Button btn8;
    @FXML
    public Button btn9;
    @FXML
    public Button btnSlash;
    @FXML
    public Button btn4;
    @FXML
    public Button btn5;
    @FXML
    public Button btn6;
    @FXML
    public Button btnMultiple;
    @FXML
    public Button btnMinus;
    @FXML
    public Label label1;

    public StringBuilder builder = new StringBuilder();
    int calc;
    double num,ans;
    @FXML
    public void initialize(){
        btn0.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                builder.append("0");
                label.setText(builder.toString());
            }
        });
        btn1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                builder.append("1");
                label.setText(builder.toString());
            }
        });
        btn2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                builder.append("2");
                label.setText(builder.toString());
            }
        });
        btn3.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                builder.append("3");
                label.setText(builder.toString());
            }
        });
        btn4.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                builder.append("4");
                label.setText(builder.toString());
            }
        });
        btn5.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                builder.append("5");
                label.setText(builder.toString());
            }
        });
        btn6.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                builder.append("6");
                label.setText(builder.toString());
            }
        });
        btn7.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                builder.append("7");
                label.setText(builder.toString());
            }
        });
        btn8.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                builder.append("8");
                label.setText(builder.toString());
            }
        });
        btn9.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                builder.append("9");
                label.setText(builder.toString());
            }
        });

        btnEquials.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                validate();
                label.setText(String.valueOf(ans));
                builder.setLength(0);
                builder.append(ans);
            }
        });

        btnClear.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                label.setText(null);
                label.setText("0");
                label1.setText(null);
                label1.setText("0");
                builder.setLength(0);
            }
        });

        btnBackShift.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                String fromLabel = label.getText();
                builder.deleteCharAt(fromLabel.length() - 1);
                label.setText(builder.toString());
            }
        });
        btnplus.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                calc = 1;
                label1.setText(label.getText());
                label.setText("0");
                builder.setLength(0);
            }
        });
        btnMinus.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                calc = 2;
                label1.setText(label.getText());
                label.setText("0");
                builder.setLength(0);
            }
        });
        btnMultiple.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                calc = 3;
                label1.setText(label.getText());
                label.setText("0");
                builder.setLength(0);
            }
        });
        btnSlash.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                calc = 4;
                label1.setText(label.getText());
                label.setText("0");
                builder.setLength(0);
            }
        });
    }




    public void validate(){
        num = Double.parseDouble(label1.getText());
        switch (calc){
            case 1:
                ans = num + Double.parseDouble(label.getText());

                break;

            case 2:
                ans = num - Double.parseDouble(label.getText());

                break;

            case 3:
                ans = num * Double.parseDouble(label.getText());

                break;

            case 4:
                ans = num / Double.parseDouble(label.getText());

                break;
        }
    }


}