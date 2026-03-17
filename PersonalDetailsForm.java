import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PersonalDetailsForm extends JFrame implements ActionListener{
	JLabel nameLabel, ageLabel;
	JTextField nameField, ageField;
	JButton submitButton;
	public PersonalDetailsForm(){
		setTitle("Personal Details Form");
		setSize(350, 200);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nameLabel = new JLabel("Name: ");
		ageLabel = new JLabel("Age: ");
		nameField = new JTextField(20);
		submitButton = new JButton("Submit");
		submitButton.addActionListener(this);
		ageField = new JTextField(5);
		add(nameLabel);
		add(nameField);
		add(ageLabel);
		add(ageField);
		add(submitButton);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String name = nameField.getText();
		String age = ageField.getText();
		JOptionPane.showMessageDialog(this,
			"Name: " + name + "\nAge: " + age,
			"Entered Details",
			JOptionPane.INFORMATION_MESSAGE);
	}
	public static void main(String[] args){
		new PersonalDetailsForm();
	}
}