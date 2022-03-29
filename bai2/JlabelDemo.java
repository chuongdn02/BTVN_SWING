/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author chuon
 */
public class JlabelDemo extends JPanel {

    JLabel jlbLabel1, jlbLabel2, jlbLabel3;

    public JlabelDemo() {
        
        
        setLayout(new GridLayout(3, 2));
        
        jlbLabel1 = new JLabel("Nguyễn Huỳnh Bảo Trân", JLabel.LEFT);
        jlbLabel1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("tran.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
        jlbLabel1.setVerticalTextPosition(JLabel.TOP);
        jlbLabel1.setHorizontalTextPosition(JLabel.CENTER);
        
        jlbLabel2 = new JLabel("", JLabel.CENTER);
        jlbLabel2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("sttran.gif")).getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH)));       
        jlbLabel2.setHorizontalTextPosition(JLabel.LEFT);
        
        jlbLabel3 = new JLabel("Trân cute", JLabel.RIGHT);
        jlbLabel3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("Tranxinh.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
        jlbLabel3.setVerticalTextPosition(JLabel.BOTTOM);
        jlbLabel3.setHorizontalTextPosition(JLabel.CENTER);
  
        add(jlbLabel1);
        add(jlbLabel2);
        add(jlbLabel3);
      
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel Demo");
        frame.setContentPane(new JlabelDemo());
        
        frame.pack();
        frame.setSize(600,730);
        frame.setVisible(true);
    }
}
