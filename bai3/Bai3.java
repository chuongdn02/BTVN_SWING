/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import bai2.JlabelDemo;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author chuon
 */
public class Bai3 extends JPanel {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    public Bai3() {
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        setLayout(new GridLayout(3, 3));

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel Demo");
        frame.setContentPane(new Bai3());
        frame.pack();
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
