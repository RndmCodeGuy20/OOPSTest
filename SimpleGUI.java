import javax.swing.BorderFactory;
import javax.swing.JButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleGUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    SimpleGUI() {
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Click Me!");
        label = new JLabel("Number of clicks : 0");

        panel.setBorder(BorderFactory.createEmptyBorder(60, 60, 30, 60));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.setSize(600,300);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My First GUI");
        frame.pack();
        frame.setVisible(true);

        button.addActionListener(this);
    }

    public static void main(String[] args) {
        new SimpleGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (count > 20) {
            frame.dispose();
            // -System.exit(0);
        }
        count++;
        label.setText("Number of clicks : " + count);
    }
}