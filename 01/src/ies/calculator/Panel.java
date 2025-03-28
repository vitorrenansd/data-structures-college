package ies.calculator;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;

// Design
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;

public class Panel extends JPanel {
    private JTextField display;

    public Panel() {
        // Configures the main layout
        setLayout(new BorderLayout());
        setBackground(Color.DARK_GRAY);

        // Creates text field (display)
        display = new JTextField("0");
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 30));
        display.setBackground(Color.BLACK);
        display.setForeground(Color.GREEN);
        display.setPreferredSize(new Dimension(0, 60));
        display.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(display, BorderLayout.NORTH);

        // Panel for buttons using GridLayout (4x4)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));
        buttonPanel.setBackground(Color.DARK_GRAY);

        // Buttons list
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "C", "+",
            "="
        };

        // Add to buttonPanel
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.setFocusPainted(false);

            if (label.matches("[+\\-*/=]")) {  // Operations
                button.setBackground(new Color(0, 220, 0));
                button.setForeground(Color.WHITE);
            } else if (label.equals("C")) { // Clear
                button.setBackground(new Color(220, 0, 0));
                button.setForeground(Color.WHITE);
            } else {                                 // Numbers and .
                button.setBackground(Color.LIGHT_GRAY);
                button.setForeground(Color.BLACK);
            }

            button.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 1));
            buttonPanel.add(button);
        }

        // Add to main panel
        add(buttonPanel, BorderLayout.CENTER);
    }

    public JTextField getDisplay() {
        return display;
    }
}