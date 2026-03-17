import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * This Program demonstrates:
 * JFrame , JApplet (conceptual), JWindow , JDialog,
 * JPanel, Layout Management , and Event Handling
 */

public class AllContainersDemo extends JFrame implements ActionListener {

    // Declare components
    JPanel panel;
    JButton btnApplet, btnWindow, btnDialog, btnExit;

    // Constructor
    public AllContainersDemo() {

        // Set JFrame properties
        setTitle("Java Containers Demonstration");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JPanel
        panel = new JPanel();

        // Set layout manager
        panel.setLayout(new FlowLayout());

        // Create buttons
        btnApplet = new JButton("Applet");
        btnWindow = new JButton("Window");
        btnDialog = new JButton("Dialog");
        btnExit = new JButton("Exit");

        // Add buttons to panel
        panel.add(btnApplet);
        panel.add(btnWindow);
        panel.add(btnDialog);
        panel.add(btnExit);

        // Add panel to frame
        add(panel);

        // Register event listeners
        btnApplet.addActionListener(this);
        btnWindow.addActionListener(this);
        btnDialog.addActionListener(this);
        btnExit.addActionListener(this);

        // Make frame visible
        setVisible(true);
    }

    // Event handling method
    public void actionPerformed(ActionEvent e) {

        // JApplet demonstration (conceptual)
        if (e.getSource() == btnApplet) {
            JOptionPane.showMessageDialog(
                    this,
                    "JApplet is a container that runs inside a browser.",
                    "JApplet Info",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // JWindow demonstration
        else if (e.getSource() == btnWindow) {
            JWindow window = new JWindow(this);
            JLabel label = new JLabel("This is a JWindow", JLabel.CENTER);
            window.add(label);
            window.setSize(200, 100);
            window.setLocationRelativeTo(this);
            window.setVisible(true);
        }

        // JDialog demonstration
        else if (e.getSource() == btnDialog) {
            JDialog dialog = new JDialog(this, "JDialog Box", true);
            dialog.setLayout(new FlowLayout());
            dialog.add(new JLabel("This is a JDialog window"));
            dialog.setSize(250, 120);
            dialog.setLocationRelativeTo(this);
            dialog.setVisible(true);
        }

        // Exit application
        else if (e.getSource() == btnExit) {
            System.exit(0);
        }
    }

    // Main method
    public static void main(String[] args) {
        new AllContainersDemo();
    }
}
		