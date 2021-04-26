package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slot implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton spin = new JButton();
JLabel ornage = new JLabel();
JLabel Lime = new JLabel();
JLabel Cherrt = new JLabel();
Random ran = new Random();
public void run() {
	frame.add(panel);
	panel.add(spin);
	spin.setText("Spin!");
	frame.setTitle("Slot Machine!");
	ornage.setIcon(new ImageIcon("ornage.jpg"));
	Lime.setIcon(new ImageIcon("Lime.jpg"));
	Cherrt.setIcon(new ImageIcon("Cherrt.jpg"));
	spin.addActionListener(this);
	panel.add(ornage);
	panel.add(Lime);
	panel.add(Cherrt);
	frame.setVisible(true);
	frame.pack();
	
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if (arg0.getSource()==spin) {
		int num = ran.nextInt(3);
		if (num==0) {
			ornage.setIcon(new ImageIcon("ornage.jpg"));
		}if (num==1) {
			ornage.setIcon(new ImageIcon("Lime.jpg"));
		}if (num==2) {
			ornage.setIcon(new ImageIcon("Cherrt.jpg"));
		}
		num = ran.nextInt(3);
		if(num==0) {
			Lime.setIcon(new ImageIcon("ornage.jpg"));
		}if(num==1) {
			Lime.setIcon(new ImageIcon("Lime.jpg"));
		}if(num==2) {
			Lime.setIcon(new ImageIcon("Cherrt.jpg"));
		}
		num = ran.nextInt(3);
		if(num==0) {
			Cherrt.setIcon(new ImageIcon("ornage.jpg"));
		}if(num==1) {
			Cherrt.setIcon(new ImageIcon("Lime.jpg"));
		}if(num==2) {
			Cherrt.setIcon(new ImageIcon("Cherrt.jpg"));
		}
	}
}
}
