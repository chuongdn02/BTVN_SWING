/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author chuon
 */
public class JSplitPaneDemo extends JFrame {

    private JPanel logoPane, loginPane;
    private JTextField tfs;
    private JSplitPane mainPane;

    private void createLogoPane() {
        logoPane = new JPanel(new GridLayout(1, 1));
        logoPane.setBackground(Color.white);

        logoPane.add(new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("download.png")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH))));
    }

    private void createLoginPane() {
        loginPane = new JPanel();
        loginPane.setLayout(new BorderLayout());
        loginPane.setBackground(Color.white);
        JPanel headPane = new JPanel();
        JLabel tt = new JLabel("Login", JLabel.CENTER);
        tt.setFont(new javax.swing.plaf.FontUIResource("Arial", Font.BOLD, 18));
        headPane.add(tt);;
        JPanel bPane = new JPanel(new GridLayout(0, 2, 5, 5));
        bPane.setBorder(BorderFactory.createEmptyBorder(20, 15, 20, 15));
        bPane.add(new JLabel("Username" + ":", JLabel.RIGHT));
        tfs = new JTextField(12);
        bPane.add(tfs);
        bPane.add(new JLabel("Password" + ":", JLabel.RIGHT));
        tfs = new JTextField(12);
        bPane.add(tfs);
        JPanel footPane = new JPanel();
        JButton button = new JButton("Login");
        footPane.add(button);
        footPane.setBackground(Color.white);
        bPane.add(footPane, BorderLayout.SOUTH);
        loginPane.add(headPane, BorderLayout.NORTH);
        loginPane.add(bPane, BorderLayout.CENTER);
    }

    public JSplitPaneDemo() {
        createLogoPane();
        createLoginPane();
        mainPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, logoPane, loginPane);
        setContentPane(mainPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Online Shopping");
        pack();
    }

    public static void main(String[] args) {
        JSplitPaneDemo s = new JSplitPaneDemo();
        s.pack();
        s.show();
    }
}
