package com.kramator.main;

import com.kramator.listeners.ButtonListeners;
import com.kramator.listeners.LabelListeners;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class LoginForm extends JFrame {

    private JPanel contentPane;
    private JPanel panelTop;
    private JPanel panelLogin;
    private JLabel lblLoginForm;
    private JLabel lblClose;
    private JLabel lblMinimize;
    private JLabel lblUsername;
    private JLabel lblPassword;
    private JLabel lblRegister;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnCancel;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginForm frame = new LoginForm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public LoginForm() {
        init();
    }

    private void init() {
        createFrame();
        createPanel();
        createLabel();
        createTextField();
        createButton();
    }

    private void createFrame() {
        setUndecorated(true);
        setBackground(Color.WHITE);
        setResizable(false);
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 370, 272);
        setLocationRelativeTo(null);
    }

    private void createPanel() {
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        panelTop = new JPanel();
        panelTop.setLayout(null);
        panelTop.setBackground(new Color(248,148,6));
        panelTop.setBounds(0, 0, 371, 40);
        contentPane.add(panelTop);

        panelLogin = new JPanel();
        panelLogin.setToolTipText("");
        panelLogin.setLayout(null);
        panelLogin.setBounds(0, 40, 371, 231);
        panelLogin.setBackground(new Color(44,62,80));
        contentPane.add(panelLogin);
    }

    private void createLabel() {
        lblLoginForm = new JLabel("Login Form");
        lblLoginForm.setForeground(Color.WHITE);
        lblLoginForm.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblLoginForm.setBounds(25, 0, 143, 40);
        panelTop.add(lblLoginForm);

        lblClose = new JLabel("X");
        lblClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblClose.setForeground(Color.WHITE);
        lblClose.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblClose.setBounds(333, 0, 21, 40);
        addLabelListeners(lblClose, this);
        panelTop.add(lblClose);

        lblMinimize = new JLabel("-");
        lblMinimize.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblMinimize.setForeground(Color.WHITE);
        lblMinimize.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblMinimize.setBounds(308, 0, 15, 40);
        addLabelListeners(lblMinimize, this);
        panelTop.add(lblMinimize);

        lblUsername = new JLabel("Username:");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblUsername.setBounds(25, 54, 91, 22);
        lblUsername.setForeground(new Color(236,240,241));
        panelLogin.add(lblUsername);

        lblPassword = new JLabel("Password:");
        lblPassword.setForeground(new Color(236, 240, 241));
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPassword.setBounds(25, 99, 91, 22);
        panelLogin.add(lblPassword);

        lblRegister = new JLabel("Click here to create a new account");
        lblRegister.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblRegister.setForeground(Color.WHITE);
        lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
        lblRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblRegister.setBounds(126, 200, 204, 20);
        addLabelListeners(lblRegister, this);
        panelLogin.add(lblRegister);
    }

    private void createTextField() {
        txtUsername = new JTextField();
        txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtUsername.setBounds(126, 54, 204, 25);
        txtUsername.setBackground(new Color(108,122,137));
        txtUsername.setForeground(new Color(228,241,254));
        txtUsername.setColumns(10);
        panelLogin.add(txtUsername);

        txtPassword = new JPasswordField();
        txtPassword.setEchoChar('*');
        txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtPassword.setBounds(126, 99, 204, 25);
        txtPassword.setBackground(new Color(108,122,137));
        txtPassword.setForeground(new Color(228,241,254));
        panelLogin.add(txtPassword);
    }

    private void createButton() {
        btnLogin = new JButton("Login");
        btnLogin.setBorder(UIManager.getBorder("Button.border"));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnLogin.setBackground(new Color(34,167,240));
        btnLogin.setBounds(241, 146, 89, 30);
        addButtonListeners(btnLogin, this);
        panelLogin.add(btnLogin);

        btnCancel = new JButton("Cancel");
        btnCancel.setForeground(Color.WHITE);
        btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnCancel.setBorder(UIManager.getBorder("Button.border"));
        btnCancel.setBackground(new Color(242, 38, 19));
        btnCancel.setBounds(126, 146, 89, 30);
        addButtonListeners(btnCancel, this);
        panelLogin.add(btnCancel);
    }

    private void addButtonListeners(JButton button, JFrame frame) {
        ButtonListeners buttonListeners = new ButtonListeners(frame);
        button.addActionListener(buttonListeners);
    }

    private void addLabelListeners(JLabel label, JFrame frame) {
        LabelListeners mouseListeners = new LabelListeners(frame);
        label.addMouseListener(mouseListeners);
    }
}
