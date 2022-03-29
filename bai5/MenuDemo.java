/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author chuon
 */
public class MenuDemo extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu mainMenu, helpMenu, viewMenu;
    private JMenuItem login, logout, exit, edit, view, about, p1, p2, p3;
    private AppMenuListener appMenuLis = new AppMenuListener();
    private JPanel mainPanel;
    JLabel jlbLabel1;

    private JMenuItem createMenuItem(String name) {
        JMenuItem menuItem = new JMenuItem(name);
        menuItem.addActionListener(appMenuLis);
        return menuItem;
    }



    public class AppMenuListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Object itemClicked = e.getSource();
            if (itemClicked == login) {
                mainPanel.add(new JLabel("Hello", JLabel.CENTER));
                pack();
            }
            if (itemClicked == p1) {
                jlbLabel1 = new JLabel("Ảnh 1", JLabel.LEFT);
                jlbLabel1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("tran.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
                jlbLabel1.setVerticalTextPosition(JLabel.TOP);
                jlbLabel1.setHorizontalTextPosition(JLabel.CENTER);
                add(jlbLabel1);
                pack();
            }
            if (itemClicked == p2) {
                jlbLabel1 = new JLabel("Ảnh 2", JLabel.LEFT);
                jlbLabel1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("sttran.gif")).getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH)));
                jlbLabel1.setVerticalTextPosition(JLabel.TOP);
                jlbLabel1.setHorizontalTextPosition(JLabel.CENTER);
                add(jlbLabel1);
                pack();
            }
            if (itemClicked == p3) {
                jlbLabel1 = new JLabel("Ảnh 3", JLabel.LEFT);
                jlbLabel1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("Tranxinh.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
                jlbLabel1.setVerticalTextPosition(JLabel.TOP);
                jlbLabel1.setHorizontalTextPosition(JLabel.CENTER);
                add(jlbLabel1);
                pack();
            }
            if (itemClicked == exit) {
                dispose();
            }
        }
    }

    public void actionPerformed(ActionEvent e) {

    }

    public MenuDemo() {
        mainPanel = new JPanel(new GridLayout(0, 3, 2, 5));
        login = createMenuItem("Login");
        logout = createMenuItem("Logout");
        exit = createMenuItem("Exit");
        edit = createMenuItem("Edit");
        view = createMenuItem("View");
        about = createMenuItem("About");
        p1 = createMenuItem("picture1");
        p2 = createMenuItem("picture2");
        p3 = createMenuItem("picture3");
        //
        menuBar = new JMenuBar();
        viewMenu = new JMenu("View");
        mainMenu = new JMenu("File");
        helpMenu = new JMenu("Help");
        menuBar.add(mainMenu);
        menuBar.add(helpMenu);
        menuBar.add(viewMenu);
        
        mainMenu.add(login);
        mainMenu.add(logout);
        mainMenu.add(edit);
        mainMenu.add(view);
        mainMenu.add(exit);
        helpMenu.add(about);
        viewMenu.add(p1);
        viewMenu.add(p2);
        viewMenu.add(p3);
        setJMenuBar(menuBar);
        setContentPane(mainPanel);
    }

    public static void main(String[] args) {
        MenuDemo s = new MenuDemo();
        s.setPreferredSize(new Dimension(800, 800));
        
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setTitle("EditPlus");

        s.pack();
        s.show();
    }
}
