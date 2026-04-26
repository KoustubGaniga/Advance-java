package swings;

import javax.swing.*;
import java.awt.event.*;

public class ImageButtonExample {

    JLabel label;

    ImageButtonExample() {

        JFrame frame = new JFrame("Image Button Example");

        // Label
        label = new JLabel("Click a button");
        label.setBounds(50, 50, 300, 30);

        // Load Images safely
        ImageIcon clockIcon = new ImageIcon(
        	    getClass().getResource("/swings/images/digitalclock.png"));

        	ImageIcon hourGlassIcon = new ImageIcon(
        	    getClass().getResource("/swings/images/hourglass.png"));

        // Buttons
        JButton btnClock = new JButton(clockIcon);
        JButton btnHourGlass = new JButton(hourGlassIcon);

        btnClock.setBounds(50, 100, 120, 120);
        btnHourGlass.setBounds(200, 100, 120, 120);

        // Remove button border (optional for better UI)
        btnClock.setBorder(null);
        btnHourGlass.setBorder(null);

        // Actions
        btnClock.addActionListener(e ->
                label.setText("Digital Clock is pressed"));

        btnHourGlass.addActionListener(e ->
                label.setText("Hour Glass is pressed"));

        // Add components
        frame.add(btnClock);
        frame.add(btnHourGlass);
        frame.add(label);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}