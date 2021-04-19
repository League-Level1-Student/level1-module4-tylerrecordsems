package _11_whack_a_mole;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class mole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random ran = new Random();
	JButton mole;
int score=0;
	public void run() {
		frame.add(panel);
		panel.setLayout(new GridLayout(5,3));
		frame.setVisible(true);
		frame.setTitle("Whack-a-Mole!");
		drawButtons(ran.nextInt(15));
		frame.pack();
	}

	void drawButtons(int num) {
		for (int i = 0; i < 15; i++) {
			JButton button = new JButton();
			if (i == num) {
				mole = button;
				mole.setText("Mole!");

			}
			button.addActionListener(this);
			panel.add(button);
		}
	}
	  static void speak(String words) {
	        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
	            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
	                    + words + "');\"";
	            
	            try {
	                Runtime.getRuntime().exec( cmd ).waitFor();
	                
	            } catch( Exception e ) {
	                e.printStackTrace();
	                
	            }
	        } else {
	            try {
	                Runtime.getRuntime().exec( "say " + words ).waitFor();
	                
	            } catch( Exception e ) {
	                e.printStackTrace();
	               
	            }
	        }
	    }
	  private void endGame(Date timeAtStart, int molesWhacked) { 
		    Date timeAtEnd = new Date();
		    JOptionPane.showMessageDialog(null, "Your whack rate is "
		            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
		                  + " moles per second.");
		}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
if(score==10) {
	//START WORK HERE:::   endGame(5,10);
}
		if(arg0.getSource()==mole	) {
	 System.out.println("WHACK!!");
	 score+=1;
	// drawButtons(ran.nextInt(15));
}else {
	 System.out.println("Missed!");
	score-=1;
}
frame.dispose();
frame=new JFrame();
panel= new JPanel();
panel.setLayout(new GridLayout(5,3));
frame.add(panel);
frame.setVisible(true);
drawButtons(ran.nextInt(15));
frame.pack();
	}
}
