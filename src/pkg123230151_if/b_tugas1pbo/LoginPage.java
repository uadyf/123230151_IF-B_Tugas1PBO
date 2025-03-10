/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230151_if.b_tugas1pbo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ASUS
 */
public class LoginPage {
    LoginPage() {
        JFrame frame = new JFrame("Login Page");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel userLabel = new JLabel("Username :");
        JTextField userText = new JTextField();
        JLabel passLabel = new JLabel("Password :");
        JPasswordField passText = new JPasswordField();
        JButton loginButton = new JButton("Login");

        frame.add(userLabel);
        frame.add(userText);
        frame.add(passLabel);
        frame.add(passText);
        frame.add(new JLabel());
        frame.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passText.getPassword());

                if (username.equals("123230151") && password.equals("pass12345")) {
                    frame.dispose();
                    HomePage home = new HomePage(username);
                    home.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password", "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
