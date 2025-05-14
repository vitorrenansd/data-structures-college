package ies.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private Panel panel;

    public ButtonListener(Panel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // Numbers and .
        if (command.matches("[0-9]") || command.equals(".")) {
            if (panel.isNewNumber) {
                panel.display.setText(command.equals(".") ? "0." : command);
                panel.isNewNumber = false;
            } else {
                String currentText = panel.display.getText();
                // Cant write more than 1 dot
                if (command.equals(".") && currentText.contains(".")) {
                    return;
                }
                panel.display.setText(currentText + command);
            }
        }
        // Operations
        else if (command.matches("[+\\-*/]")) {
            if (panel.firstNumber == null) {
                try {
                    panel.firstNumber = Float.parseFloat(panel.display.getText());
                } catch (NumberFormatException ex) {
                    panel.display.setText("Error");
                    return;
                }
            }
            panel.currentOperation = command;
            panel.isNewNumber = true;
        }
        // Equals (=)
        else if (command.equals("=")) {
            if (panel.firstNumber != null && panel.currentOperation != null) {
                try {
                    Float secondNumber = Float.parseFloat(panel.display.getText());
                    Float result = calculate(panel.firstNumber, secondNumber, panel.currentOperation);
                    panel.display.setText(String.valueOf(result));
                    panel.firstNumber = result;
                    panel.currentOperation = null;
                    panel.isNewNumber = true;
                } catch (NumberFormatException ex) {
                    panel.display.setText("Error");
                } catch (ArithmeticException ex) {
                    panel.display.setText("Error" + ex.getMessage());
                }
            }
        }
        // Clear (C)
        else if (command.equals("C")) {
            panel.display.setText("0");
            panel.firstNumber = null;
            panel.currentOperation = null;
            panel.isNewNumber = true;
        }
    }

    // Method to call class Operation
    private Float calculate(Float x, Float y, String op) {
        switch (op) {
            case "+":
                return panel.operation.sum(x, y);
            case "-":
                return panel.operation.sub(x, y);
            case "*":
                return panel.operation.multipl(x, y);
            case "/":
                return panel.operation.div(x, y);
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}