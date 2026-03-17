import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GradeCalculator extends JFrame implements ActionListener {

    
    JTextField sub1Field, sub2Field, sub3Field;
    JButton calculateButton;
    JLabel resultLabel;

    public GradeCalculator() {

        
        setTitle("Marks & Grade Calculator");
        setSize(400, 250);
        setLayout(new GridLayout(5, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        add(new JLabel("Subject 1 Marks:"));
        sub1Field = new JTextField();
        add(sub1Field);

        add(new JLabel("Subject 2 Marks:"));
        sub2Field = new JTextField();
        add(sub2Field);

        add(new JLabel("Subject 3 Marks:"));
        sub3Field = new JTextField();
        add(sub3Field);

        
        calculateButton = new JButton("Calculate Result");
        calculateButton.addActionListener(this);
        add(calculateButton);


        resultLabel = new JLabel("Result: ");
        add(resultLabel);

        setVisible(true);
    }

  
    public void actionPerformed(ActionEvent e) {
        try {
            
            double m1 = Double.parseDouble(sub1Field.getText());
            double m2 = Double.parseDouble(sub2Field.getText());
            double m3 = Double.parseDouble(sub3Field.getText());

            
            double avg = (m1 + m2 + m3) / 3;

            
            String grade;
            if (avg >= 90) {
                grade = "A";
            } else if (avg >= 75) {
                grade = "B";
            } else if (avg >= 50) {
                grade = "C";
            } else {
                grade = "Fail";
            }

            
            resultLabel.setText("Average: " + avg + " | Grade: " + grade);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid numeric marks!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new GradeCalculator();
    }
}