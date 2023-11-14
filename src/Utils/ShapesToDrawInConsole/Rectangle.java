package Utils.ShapesToDrawInConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rectangle extends JPanel{

        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setSize(400, 400);
            frame.add(new Rectangle());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }

        public void paint(Graphics g) {
            g.setColor(Color.blue);
            g.fillRect(45, 75, 170, 120);
        }



}
