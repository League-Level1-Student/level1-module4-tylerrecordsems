package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typing_tutor implements KeyListener {
	public static void main(String[] args) {
		 
			  typing_tutor tutor = new typing_tutor();
			  tutor.setup(); 
			  
	
		
	}
	JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
	 char currentLetter;
	void setup(){
       
        
      
        currentLetter = generateRandomLetter();
        label.setText(""+ currentLetter);
        label.setFont(label.getFont().deriveFont(28.0f));
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.addKeyListener(this);
        frame.add(panel);
        frame.setVisible(true);
        panel.add(label);
        frame.pack();
        
	}


char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
    
}
@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("You Typed "+ arg0.getKeyChar());
	if (arg0.getKeyChar() == currentLetter) {
		System.out.println("correct!");
		panel.setBackground(Color.GREEN);
		frame.pack();
		
		
			
	}else {
		panel.setBackground(Color.RED);
		System.out.println("Incorrect");
	}
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	label.setText("" + currentLetter);
	frame.pack();
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
