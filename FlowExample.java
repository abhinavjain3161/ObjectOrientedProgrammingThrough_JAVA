import javax.swing.*;
import java.awt.*;
public class FlowExample{
	public static void main(String[] args){
		JFrame frame = new JFrame("Flow Layout");
		frame.setLayout(new FlowLayout());
		frame.add(new JButton("Button1"));
		frame.add(new JButton("Button2"));
		frame.add(new JButton("Button3"));
		frame.setSize(300,200);
		frame.setVisible(true);
	}
}
