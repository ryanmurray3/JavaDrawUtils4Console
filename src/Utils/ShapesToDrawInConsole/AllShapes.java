package Utils.ShapesToDrawInConsole;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AllShapes extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.add(new AllShapes());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawRect(10, 10, 50, 50);             // Draws a square
        g.drawRect(10, 75, 100, 50);            // Draws a rectangle
        g.drawPolygon(new int[] {35, 10, 60},   // Draws a triangle
                new int[] {150, 200, 200},
                3);
        g.drawArc(115, 135, 100, 100, 0, 360);  // Draws a circle
    }
}
