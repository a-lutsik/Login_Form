package com.kramator.listeners;

import com.kramator.main.LoginForm;
import com.kramator.main.RegisterForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListeners implements ActionListener {
    private JFrame frame;

    public ButtonListeners(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (!(event.getSource() instanceof JButton)) {
            return;
        }

        JButton button = (JButton) event.getSource();

        if (button.getText().equals("Cancel")) {
            if (frame instanceof LoginForm) {
                System.exit(0);
            } else if (frame instanceof RegisterForm) {
                LoginForm lf = new LoginForm();
                lf.setVisible(true);
                lf.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.dispose();
            }

        } else if (button.getText().equals("Login")) {
            //TODO SOMETHING
        } else if (button.getText().equals("Register")) {
            //TODO SOMETHING
        }
    }
}
