package _04_chuckle_clicker;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Clicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
public static void main(String[] args) {
	
}
public void makeButtons() {
frame.add(panel);
panel.add(button1);
panel.add(button2);
button1.setText("Joke");
button2.setText("PunchLine");

frame.setVisible(true);

button1.addActionListener(this);
button2.addActionListener(this);
frame.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource()== button1  ) {
	//	JOptionPane.showMessageDialog(null, "hi");
	}
if(arg0.getSource()== button2  ) {
//	JOptionPane.showMessageDialog(null, "hi");
	}
if(arg0.getSource() == button2) {
	JOptionPane.showMessageDialog(null, "Because they use HoneyCombs");
}
if(arg0.getSource() == button1) {
	JOptionPane.showMessageDialog(null, "Why do Bees have Sticky Hair?" );
}
}
}
