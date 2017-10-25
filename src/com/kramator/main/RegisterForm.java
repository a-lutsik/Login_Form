package com.kramator.main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

import com.kramator.listeners.ButtonListeners;
import com.kramator.listeners.LabelListeners;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;
import java.awt.Cursor;

public class RegisterForm extends JFrame {

    private JPanel contentPane;
    private JPanel panelTopReg;
    private JPanel panelReg;
    private JLabel lblRegisterForm;
    private JLabel lblCloseReg;
    private JLabel lblMinimizeReg;
    private JLabel lblUsernameReg;
    private JLabel lblPasswordReg;
    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JLabel lblRetypePass;
    private JLabel lblBirthdate;
    private JLabel lblEmail;
    private JLabel lblAdress;
    private JLabel lblClickHereTo;
    private JTextField txtUsernameReg;
    private JPasswordField txtPasswordReg;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JPasswordField txtRetypePass;
    private JDateChooser dateChooser;
    private JTextField textField;
    private JButton btnRegister;
    private JButton btnCancelReg;
    private JTextArea txtAddress;

    /**
     * Create the frame.
     */
    public RegisterForm() {
        init();
    }

    private void init() {
        createFrameReg();
        createPanelReg();
        createLabelReg();
        createTextFieldReg();
        createDateChooserReg();
        createButtonReg();
        createTextAreaReg();
    }

    private void createFrameReg() {
        setUndecorated(true);
        setBounds(100, 100, 430, 600);
    }

    private void createPanelReg() {
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        panelTopReg = new JPanel();
        panelTopReg.setLayout(null);
        panelTopReg.setBackground(new Color(248, 148, 6));
        panelTopReg.setBounds(0, 0, 430, 40);
        contentPane.add(panelTopReg);

        panelReg = new JPanel();
        panelReg.setLayout(null);
        panelReg.setToolTipText("");
        panelReg.setBackground(new Color(44, 62, 80));
        panelReg.setBounds(0, 40, 430, 560);
        contentPane.add(panelReg);
    }

    private void createLabelReg() {
        lblRegisterForm = new JLabel("Register Form");
        lblRegisterForm.setForeground(Color.WHITE);
        lblRegisterForm.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblRegisterForm.setBounds(25, 0, 176, 40);
        panelTopReg.add(lblRegisterForm);

        lblCloseReg = new JLabel("X");
        lblCloseReg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblCloseReg.setForeground(Color.WHITE);
        lblCloseReg.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblCloseReg.setBounds(399, 0, 21, 40);
        addLabelListeners(lblCloseReg, this);
        panelTopReg.add(lblCloseReg);

        lblMinimizeReg = new JLabel("-");
        lblMinimizeReg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblMinimizeReg.setForeground(Color.WHITE);
        lblMinimizeReg.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblMinimizeReg.setBounds(374, 0, 15, 40);
        addLabelListeners(lblMinimizeReg, this);
        panelTopReg.add(lblMinimizeReg);

        lblFirstName = new JLabel("First name:");
        lblFirstName.setForeground(new Color(236, 240, 241));
        lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblFirstName.setBounds(25, 47, 91, 22);
        panelReg.add(lblFirstName);

        lblLastName = new JLabel("Last name:");
        lblLastName.setForeground(new Color(236, 240, 241));
        lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblLastName.setBounds(25, 96, 91, 22);
        panelReg.add(lblLastName);

        lblUsernameReg = new JLabel("Username:");
        lblUsernameReg.setForeground(new Color(236, 240, 241));
        lblUsernameReg.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblUsernameReg.setBounds(25, 144, 85, 22);
        panelReg.add(lblUsernameReg);

        lblPasswordReg = new JLabel(" Password:");
        lblPasswordReg.setForeground(new Color(236, 240, 241));
        lblPasswordReg.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPasswordReg.setBounds(27, 189, 90, 22);
        panelReg.add(lblPasswordReg);

        lblRetypePass = new JLabel("Retype pass:");
        lblRetypePass.setForeground(new Color(236, 240, 241));
        lblRetypePass.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblRetypePass.setBounds(10, 236, 106, 22);
        panelReg.add(lblRetypePass);

        lblBirthdate = new JLabel(" BirthDate:");
        lblBirthdate.setForeground(new Color(236, 240, 241));
        lblBirthdate.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblBirthdate.setBounds(27, 291, 85, 22);
        panelReg.add(lblBirthdate);

        lblEmail = new JLabel("E-mail:");
        lblEmail.setForeground(new Color(236, 240, 241));
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblEmail.setBounds(57, 342, 55, 22);
        panelReg.add(lblEmail);

        lblAdress = new JLabel("Address:");
        lblAdress.setForeground(new Color(236, 240, 241));
        lblAdress.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblAdress.setBounds(44, 388, 68, 22);
        panelReg.add(lblAdress);

        lblClickHereTo = new JLabel("Click here to login");
        lblClickHereTo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblClickHereTo.setHorizontalAlignment(SwingConstants.CENTER);
        lblClickHereTo.setForeground(Color.WHITE);
        lblClickHereTo.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblClickHereTo.setBounds(126, 529, 204, 20);
        addLabelListeners(lblClickHereTo, this);
        panelReg.add(lblClickHereTo);
    }

    private void createTextFieldReg() {
        txtFirstName = new JTextField();
        txtFirstName.setForeground(new Color(228, 241, 254));
        txtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtFirstName.setColumns(10);
        txtFirstName.setBackground(new Color(108, 122, 137));
        txtFirstName.setBounds(126, 47, 204, 25);
        panelReg.add(txtFirstName);

        txtLastName = new JTextField();
        txtLastName.setForeground(new Color(228, 241, 254));
        txtLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtLastName.setColumns(10);
        txtLastName.setBackground(new Color(108, 122, 137));
        txtLastName.setBounds(126, 96, 204, 25);
        panelReg.add(txtLastName);

        txtUsernameReg = new JTextField();
        txtUsernameReg.setForeground(new Color(228, 241, 254));
        txtUsernameReg.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtUsernameReg.setColumns(10);
        txtUsernameReg.setBackground(new Color(108, 122, 137));
        txtUsernameReg.setBounds(126, 144, 204, 25);
        panelReg.add(txtUsernameReg);

        txtPasswordReg = new JPasswordField();
        txtPasswordReg.setForeground(new Color(228, 241, 254));
        txtPasswordReg.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtPasswordReg.setEchoChar('*');
        txtPasswordReg.setBackground(new Color(108, 122, 137));
        txtPasswordReg.setBounds(126, 189, 204, 25);
        panelReg.add(txtPasswordReg);

        txtRetypePass = new JPasswordField();
        txtRetypePass.setForeground(new Color(228, 241, 254));
        txtRetypePass.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtRetypePass.setEchoChar('*');
        txtRetypePass.setBackground(new Color(108, 122, 137));
        txtRetypePass.setBounds(126, 236, 204, 25);
        panelReg.add(txtRetypePass);

        textField = new JTextField();
        textField.setForeground(new Color(228, 241, 254));
        textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textField.setColumns(10);
        textField.setBackground(new Color(108, 122, 137));
        textField.setBounds(126, 339, 204, 25);
        panelReg.add(textField);
    }

    private void createDateChooserReg() {
        dateChooser = new JDateChooser();
        dateChooser.setBounds(126, 288, 204, 25);
        dateChooser.setBackground(new Color(112, 128, 144));
        panelReg.add(dateChooser);
    }

    private void createButtonReg() {
        btnRegister = new JButton("Register");
        btnRegister.setForeground(Color.WHITE);
        btnRegister.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnRegister.setBorder(UIManager.getBorder("Button.border"));
        btnRegister.setBackground(new Color(34, 167, 240));
        btnRegister.setBounds(238, 488, 92, 30);
        addButtonListeners(btnRegister, this);
        panelReg.add(btnRegister);

        btnCancelReg = new JButton("Cancel");
        btnCancelReg.setForeground(Color.WHITE);
        btnCancelReg.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnCancelReg.setBorder(UIManager.getBorder("Button.border"));
        btnCancelReg.setBackground(new Color(242, 38, 19));
        btnCancelReg.setBounds(126, 488, 89, 30);
        addButtonListeners(btnCancelReg, this);
        panelReg.add(btnCancelReg);
    }

    public void createTextAreaReg() {
        txtAddress = new JTextArea();
        txtAddress.setBounds(126, 388, 204, 76);
        txtAddress.setBackground(new Color(108, 122, 137));
        txtAddress.setForeground(new Color(228, 241, 254));
        panelReg.add(txtAddress);
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
