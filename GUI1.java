import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JFrameWithPanel implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	public JFrameWithPanel(){
		// Create JFrame
		frame = new JFrame("JFrame with JPanel");
		// create JPanel
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		// create Button
		button = new JButton("Click Me");
		// Add ActionListener
		button.addActionListener(this);
		// Add button to panel
		panel.add(button);
		// Add panel to frame
		frame.add(panel);
		// Frame settings
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	// Event handling
	public void actionPerformed(ActionEvent e){
		System.out.println("Button Clicked!");
	}
	public static void main(String[] args){
		new JFrameWithPanel();
	}
}
	