import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener {

    // Components
    JTextField inputField;
    JButton cToFButton, fToCButton;
    JLabel resultLabel;

    public TemperatureConverter() {

        // Frame setup
        setTitle("Temperature Converter");
        setSize(400, 200);
        setLayout(new GridLayout(3, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Input
        JLabel inputLabel = new JLabel("Enter Temperature:");
        inputField = new JTextField();

        // Buttons
        cToFButton = new JButton("Celsius → Fahrenheit");
        fToCButton = new JButton("Fahrenheit → Celsius");

        // Result
        resultLabel = new JLabel("Result: ");

        // Add listeners
        cToFButton.addActionListener(this);
        fToCButton.addActionListener(this);

        // Add components
        add(inputLabel);
        add(inputField);
        add(cToFButton);
        add(fToCButton);
        add(new JLabel()); // spacing
        add(resultLabel);

        setVisible(true);
    }

    // Event Handling
    public void actionPerformed(ActionEvent e) {
        try {
            double temp = Double.parseDouble(inputField.getText());
            double result;

            if (e.getSource() == cToFButton) {
                result = (temp * 9/5) + 32;
                resultLabel.setText("Result: " + result + " °F");
            } 
            else if (e.getSource() == fToCButton) {
                result = (temp - 32) * 5/9;
                resultLabel.setText("Result: " + result + " °C");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid number!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}