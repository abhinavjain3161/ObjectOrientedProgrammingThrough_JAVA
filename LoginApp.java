import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginApp extends JFrame implements ActionListener {

    // Components
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    public LoginApp() {

        // Frame setup
        setTitle("Login Application");
        setSize(350, 200);
        setLayout(new GridLayout(3, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        // Input fields
        usernameField = new JTextField();
        passwordField = new JPasswordField();

        // Button
        loginButton = new JButton("Login");

        // Add action listener
        loginButton.addActionListener(this);

        // Add components
        add(userLabel);
        add(usernameField);
        add(passLabel);
        add(passwordField);
        add(new JLabel()); // empty space
        add(loginButton);

        setVisible(true);
    }

    // Event Handling
    public void actionPerformed(ActionEvent e) {

        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Validation
        if (username.equals("admin") && password.equals("1234")) {
            JOptionPane.showMessageDialog(this,
                    "Login Successful",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Invalid Username or Password",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new LoginApp();
    }
}