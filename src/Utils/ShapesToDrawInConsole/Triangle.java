package Utils.ShapesToDrawInConsole;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Triangle extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();//uses JFrame which opens a separate window
        frame.setSize(400, 400);
        frame.add(new Triangle());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        System.out.println("\033[107m\033[30m");//white
        System.out.println("\u001B[41m");//red
        System.out.println("""
                
                HELP MEEEE!!!!!
                
                \u001B[41m
                
                I got to poop!!!!
                
                """);
//        Color Name	Color Code	Background Color	Background Color Code
//        BLACK	\u001B[30m	BLACK_BACKGROUND	\u001B[40m
//        RED	\u001B[31m	RED_BACKGROUND	\u001B[41m
//        GREEN	\u001B[32m	GREEN_BACKGROUND	\u001B[42m
//        YELLOW	\u001B[33m	YELLOW_BACKGROUND	\u001B[43m
//        BLUE	\u001B[34m	BLUE_BACKGROUND	\u001B[44m
//        PURPLE	\u001B[35m	PURPLE_BACKGROUND	\u001B[45m
//        CYAN	\u001B[36m	CYAN_BACKGROUND	\u001B[46m
//        WHITE	\u001B[37m	WHITE_BACKGROUND	\u001B[47m

    }

    public void paint(Graphics g) {
        int[] xPoints = {150, 70, 230};
        int[] yPoints = {50, 200, 200};
        g.setColor(Color.pink);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
