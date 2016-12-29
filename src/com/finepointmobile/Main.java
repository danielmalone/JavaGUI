package com.finepointmobile;

import java.awt.*;

public class Main extends Frame {

    private Label lblCount;

    public Main() {
        setLayout(new FlowLayout());

        lblCount = new Label("Counter");  // construct the Label component
        add(lblCount);

        Button button = new Button("Button");
        add(button);

        setTitle("Fine Point Mobile");
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        Main app = new Main();
    }
}
