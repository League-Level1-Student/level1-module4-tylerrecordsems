package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nAsty implements ActionListener {
	
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
frame.setVisible(true);
frame.pack();
button1.addActionListener(this);
button2.addActionListener(this);
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(button2 == arg0.getSource()) {
		showPictureFromTheInternet("https://cdn.mos.cms.futurecdn.net/L6AvEgpMEnhFpGUwYMv52o.jpg");
	}if (button1 == arg0.getSource()) {
		showPictureFromTheInternet("https://dogtime.com/assets/uploads/2011/03/puppy-development-1280x720.jpg");
	}
}
}



