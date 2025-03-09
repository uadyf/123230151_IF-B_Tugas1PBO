/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123230151_if.b_tugas1pbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame {
    public HomePage(String nim) {
        setTitle("Home Page");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        JLabel welcomeLabel = new JLabel("Selamat Datang, " + nim, SwingConstants.CENTER);
        JLabel instructionLabel = new JLabel("Silakan pilih menu di bawah untuk membeli majalah", SwingConstants.CENTER);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));
        
        JButton anakButton = new JButton("Majalah Anak");
        JButton remajaButton = new JButton("Majalah Remaja");
        JButton dewasaButton = new JButton("Majalah Dewasa");
        
        buttonPanel.add(anakButton);
        buttonPanel.add(remajaButton);
        buttonPanel.add(dewasaButton);
        
        add(welcomeLabel, BorderLayout.NORTH);
        add(instructionLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        anakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PurchasePage purchase = new PurchasePage(0);
            }
        });
        
        remajaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PurchasePage purchase = new PurchasePage(1);
            }
        });
        
        dewasaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PurchasePage purchase = new PurchasePage(2);
            }
        });
        
        setVisible(true);
    }
}

