/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author chuon
 */
public class Bai4 {

    JFrame frame;
    JButton b, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;

    Bai4() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocation(100, 100);
        frame.setTitle("Ví dụ GridLayout trong Java Swing");
        frame.setLayout(new BorderLayout());

        JPanel NORTHPanel = new JPanel(new FlowLayout());
        NORTHPanel.add(new JTextField(20));
        frame.add(NORTHPanel, BorderLayout.NORTH);   

        b = new JButton("0");        
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("+");
        b11 = new JButton("-");
        b12 = new JButton("*");
        b13 = new JButton("/");
        b14 = new JButton("%");
        b15 = new JButton("=");
        b16 = new JButton("C");
        
        JPanel southPanel = new JPanel(new FlowLayout());
        southPanel.setBackground(Color.YELLOW);
        southPanel.add(b);
        southPanel.add(b1);
        southPanel.add(b2);
        southPanel.add(b3);
        southPanel.add(b4);
        southPanel.add(b5);
        southPanel.add(b6);
        southPanel.add(b7);
        southPanel.add(b8);
        southPanel.add(b9);
        southPanel.add(b10);
        southPanel.add(b11);
        southPanel.add(b12);
        southPanel.add(b13);
        southPanel.add(b14);
        southPanel.add(b15);
        southPanel.add(b16);
        frame.add(southPanel, BorderLayout.CENTER);
        southPanel.setLayout(new GridLayout(4, 5));
        
        JPanel sPanel = new JPanel(new FlowLayout());
        sPanel.setBackground(Color.YELLOW);
        sPanel.add(new JLabel("Nguyễn Văn Chương"));
        frame.add(sPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Bai4();
    }
}
