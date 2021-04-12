package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class cal implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton add = new JButton();
JButton subtract = new JButton();
JButton multiply = new JButton();
JButton divide = new JButton();
JLabel answer = new JLabel();
JTextField input1 = new JTextField(5);
JTextField input2 = new JTextField(5);
public void run() {
	frame.add(panel);
	panel.add(input1);
	panel.add(input2);
	panel.add(add);
	panel.add(subtract);
	panel.add(multiply);
	panel.add(divide);
	panel.add(answer);
	frame.setTitle("Calulator");
	add.setText("Add");
	subtract.setText("subtract");
	multiply.setText("multiply");
	divide.setText("divide");
	frame.setVisible(true);
	frame.pack();
	add.addActionListener(this);
	subtract.addActionListener(this);
	multiply.addActionListener(this);
	divide.addActionListener(this);
} 
	public int add(int num1, int num2) {
		return num1+num2;
	}
	public int subtract(int num1,int num2) {
		return num1-num2;
	}
	public int multiply(int num1,int num2) {
		return num1*num2;
	}
	public int divide(int num1,int num2) {
		return num1/num2;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(input1.getText());
		int num2=Integer.parseInt(input2.getText());
		if(arg0.getSource()==add) {
			answer.setText(""+add(num1,num2));
		}
		if(arg0.getSource()==subtract) {
			answer.setText(""+subtract(num1,num2));
		}
		if(arg0.getSource()==multiply) {
			answer.setText(""+multiply(num1,num2));
		}
		if(arg0.getSource()== divide) {
			answer.setText(""+divide(num1,num2));
		}
		frame.pack();
	}
	
}
