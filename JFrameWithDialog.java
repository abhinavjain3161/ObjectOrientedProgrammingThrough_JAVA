import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JFrameWithDialog{
	public JFrameWithDialog(){
		JFrame frame = new JFrame("Main Frame");
		JButton button = new JButton("Open Dialog");
		// Button click event
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JDialog dialog = new JDialog(frame, "Dialog Box", true);
				dialog.setLayout(new FlowLayout());
				JLabel label = new JLabel("This is a JDialog window");
				dialog.add(label);
				dialog.setSize(250,150);
				dialog.setVisible(true);
			}
		});
		frame.add(button);
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] args){
		new JFrameWithDialog();
	}
}