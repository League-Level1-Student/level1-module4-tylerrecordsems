package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slot implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spin = new JButton();
	JLabel ornage = new JLabel();
	JLabel Lime = new JLabel();
	JLabel Cherrt = new JLabel();
	Random ran = new Random();
int sum = 0;
	public void run() {
		frame.add(panel);
		panel.add(spin);
		spin.setText("Spin!");
		frame.setTitle("Slot Machine!");
		try {
			Lime = createLabelImage("Lime.jpg");
			Cherrt = createLabelImage("Cherrt.jpg");
			ornage = createLabelImage("ornage.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		spin.addActionListener(this);
		panel.add(ornage);
		panel.add(Lime);
		panel.add(Cherrt);
		frame.setVisible(true);
		Cherrt.setPreferredSize(new Dimension(100,100));
		frame.pack();
		

	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		frame.dispose();
		frame=new JFrame();
		frame.setVisible(true);
		panel=new JPanel();
		frame.add(panel);
	panel.add(spin);
	Cherrt.setPreferredSize(new Dimension(100,100));
	ornage.setPreferredSize(new Dimension(100,100));
	Lime.setPreferredSize(new Dimension(100,100));
		sum=ran.nextInt(20000);
	try {
			if (arg0.getSource() == spin) {
				int num= ran.nextInt(3);
				if (num == 0) {
					ornage=createLabelImage("ornage.jpg");
				}
				if (num == 1) {
					ornage=createLabelImage("Lime.jpg");
				}
				if (num == 2) {
					ornage=createLabelImage("Cherrt.jpg");
				}
			int 	num1 = ran.nextInt(3);
				if (num1 == 0) {
					Lime=createLabelImage("ornage.jpg");
				}
				if (num1 == 1) {

					Lime = createLabelImage("Lime.jpg");

				}
				if (num1 == 2) {
					Lime=createLabelImage("Cherrt.jpg");
				}
				int num2 = ran.nextInt(3);
				if (num2 == 0) {
					Cherrt=createLabelImage("ornage.jpg");
				}
				if (num2 == 1) {
					Cherrt=createLabelImage("Lime.jpg");
				}
				if (num2 == 2) {
					Cherrt=createLabelImage("Cherrt.jpg");
				}
				
				panel.add(Cherrt);
				panel.add(Lime);
				panel.add(ornage);
				Cherrt.setPreferredSize(new Dimension(100,100));
				ornage.setPreferredSize(new Dimension(100,100));
				Lime.setPreferredSize(new Dimension(100,100));
				if (num==0 && num1==0 && num2==0) {
					JOptionPane.showMessageDialog(null, "You Won $"+sum+"!");
				}
				if (num==1 && num1==1 && num2==1) {
					JOptionPane.showMessageDialog(null, "You Won $"+sum+"!");
				}
				if (num==2 && num1==2 && num2==2) {
					JOptionPane.showMessageDialog(null, "You Won $"+sum+"!");
				}
frame.pack();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
