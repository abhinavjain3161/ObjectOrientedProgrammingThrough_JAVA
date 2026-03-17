import javax.swing.*;
import java.awt.*;
public class LoginForm{
	public static void main(String[] args){
		JFrame frame = new JFrame("Login Form");
		frame.setLayout(new GridLayout(3,2));
		JLabel userLabel = new JLabel("Username: ");
		JTextField userText = new JTextField();
		JLabel passLabel = new JLabel("Password:");
		JPasswordField passText = new JPasswordField();
		JButton loginButton = new JButton("Login");
		frame.add(userLabel);
		frame.add(userText);
		frame.add(passLabel);
		frame.add(passText);
		frame.add(new JLabel(""));
		frame.add(loginButton);
		frame.setSize(300,150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}