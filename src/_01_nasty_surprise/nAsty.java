package _01_nasty_surprise;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class nAsty {
	
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button1 = new JButton();
JButton button2 = new JButton();
public void run() {
button1.setText("Trick");
button2.setText("Treat");

frame.add(panel);
panel.add(button1);
panel.add(button2);

}
}