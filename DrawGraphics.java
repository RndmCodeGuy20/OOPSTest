import java.awt.event.*;
import java.awt.*;

public class DrawGraphics extends Frame {
    public DrawGraphics() {
        addWindowListener(new WindowAdapter(){
            public void WindowClosing(WindowEvent wEvent) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics graphics) {
        graphics.drawLine(20, 30, 10, 40);
        graphics.drawLine(40, 130, 100, 240);
        graphics.drawLine(209, 70, 10, 50);

        graphics.drawRect(20, 150, 60, 50);
        graphics.fillRect(110, 150, 60, 50);
    }

    public static void main(String[] args) {
        DrawGraphics appwin = new DrawGraphics();

        appwin.setSize(new Dimension(370,200));
        appwin.setTitle("Draw Graphics Demo");
        appwin.setVisible(true);
    }
}
