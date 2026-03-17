import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class squareCalculator extends JFrame implements ActionListener{
	JTextField inputField;
	JButton calculateButton;
	JLabel resultLabel;
	public squareCalculator(){
		setTitle("Square Calculator");
		setSize(300,200);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel inputLabel = new JLabel("Enter Number: ");
		inputField = new JTextField(10);
		calculateButton = new JButton("Calculate Square");
		resultLabel = new JLabel("Result: ");
		calculateButton.addActionListener(this);
		add(inputLabel);
		add(inputField);
		add(calculateButton);
		add(resultLabel);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		try{
			double number = Double.parseDouble(inputField.getText());
			double square = number * number;
			resultLabel.setText("Result: " + square);
		}
		catch (NumberFormatException ex){
			JOptionPane.showMessageDialog(this,
				"Please enter a valid number!",
				"Error",
				JOptionPane.ERROR_MESSAGE);
		}
	}
	public static void main(String[] args){
		new squareCalculator();
	}
}