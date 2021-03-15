package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class typing_tutor {
	public static void main(String[] args) {
		
	
		
	}
	void setup(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        char currentLetter;
        currentLetter = generateRandomLetter();
        }


char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
}
