package com.finepointmobile;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main extends Frame implements ActionListener, WindowListener {

    private Label label;
    TextField textField;

    public Main() {
        setLayout(new FlowLayout());

        addWindowListener(this);

        label = new Label("Counter");  // construct the Label component
        add(label);

        Button button = new Button("Button");
        add(button);
        button.addActionListener(this);

        textField = new TextField("asdf");
        textField.setSize(300, 40);
        add(textField);

        setTitle("Fine Point Mobile");
        setSize(800, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        Main app = new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText(textField.getText());
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
