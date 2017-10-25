package com.kramator.listeners;

import com.kramator.main.LoginForm;
import com.kramator.main.RegisterForm;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LabelListeners extends MouseAdapter {
    private JFrame frame;

    public LabelListeners(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void mouseClicked(MouseEvent event) {
        if (!(event.getSource() instanceof JLabel)) {
            return;
        }

        JLabel label = (JLabel) event.getSource();

        if (label.getText().equals("-")) {
            frame.setState(JFrame.ICONIFIED);
        } else if (label.getText().equals("X")) {
            System.exit(0);
        } else if (label.getText().equals("Click here to create a new account")) {
            RegisterForm rf = new RegisterForm();
            rf.setVisible(true);
            rf.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.dispose();
        } else if (label.getText().equals("Click here to login")) {
            LoginForm lf = new LoginForm();
            lf.setVisible(true);
            lf.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.dispose();
        }
    }
}
