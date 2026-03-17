import javax.swing.*;
import java.awt.event.*;
public class EventExample{
	public static void main(String[] args){
		JFrame frame = new JFrame("Event Example");
		JButton button = new JButton("Click");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(frame,"Button Clicked!");
		}
});
frame.add(button);
frame.setSize(300,200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}