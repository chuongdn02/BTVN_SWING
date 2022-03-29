/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author chuon
 */
public class HelloFrame extends JFrame {

    public HelloFrame() {
        JLabel jlbHello = new JLabel("Nguyễn Huỳnh Bảo Trân");
        jlbHello.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHello.setFont(new Font("Serif", Font.PLAIN, 28));
        add(jlbHello);
        this.setSize(500, 150);
        setVisible(false);
    }

    public static void main(String args[]) {
        new HelloFrame();
    }
}
