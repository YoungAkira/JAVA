package Gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import src.Constants.CommonConstants;


public class LoginGUI extends JFrame {

    LoginGUI() {
        super(CommonConstants.APP_NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(CommonConstants.FRAME_SIZE[0], CommonConstants.FRAME_SIZE[1]);
        setLocationRelativeTo(null);
        

        addGUIComponents();
    }

    public void addGUIComponents() {
        SpringLayout springLayout = new SpringLayout();
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(springLayout);

        //username
        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        JTextField usernameField = new JTextField(CommonConstants.TEXTFIELD_SIZE[0]);
        usernameField.setFont(new Font("Dialog", Font.PLAIN, 18));


        springLayout.putConstraint(SpringLayout.WEST, usernameLabel, 35, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, usernameLabel, 85, SpringLayout.NORTH, loginPanel);
        springLayout.putConstraint(SpringLayout.WEST, usernameField, 135, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, usernameField, 85, SpringLayout.NORTH, loginPanel);
        

        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);

        //password
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        JTextField passwordField =  new JTextField(CommonConstants.TEXTFIELD_SIZE[0]);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 18));


        springLayout.putConstraint(SpringLayout.WEST, passwordLabel, 35, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, passwordLabel, 135, SpringLayout.NORTH, loginPanel);
        springLayout.putConstraint(SpringLayout.WEST, passwordField, 135, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, passwordField, 135, SpringLayout.NORTH, loginPanel);

        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);

        //Login button

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Dialog", Font.BOLD, 18));

        springLayout.putConstraint(SpringLayout.WEST, loginButton, 170, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, loginButton, 250, SpringLayout.NORTH, loginPanel);
        loginButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();

                if(username.equals("username") && password.equals("password")) {
                    System.out.println();
                    System.out.println("LOGIN SUCCESSFULL");
                }
                else {
                    System.out.println("LOGIN FAILED...");
                }
            }
        });

        loginPanel.add(loginButton);

        this.getContentPane().add(loginPanel);
    }

}
