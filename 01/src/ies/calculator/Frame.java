package ies.calculator;

import javax.swing.JFrame;

public class Frame extends JFrame{
    
    public Frame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculator");
        setSize(250, 360);
        setLocationRelativeTo(null);

        // Add panel with buttons
        Panel panel = new Panel();
        add(panel);

        setVisible(true);
    }
}