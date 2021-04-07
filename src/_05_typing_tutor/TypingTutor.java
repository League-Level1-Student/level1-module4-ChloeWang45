package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {

	char currentLetter;
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	static Date timeAtStart = new Date();
	static int correct = 0;
    
	private static void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	    Date timeAtEnd = new Date();
	    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	    long gameInSeconds = (gameDuration / 1000) % 60;
	    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	    int charactersPerMinute = (int) (charactersPerSecond * 60);
	    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	} 
	
	public static void main(String[] args) {
		
		TypingTutor tutor = new TypingTutor();
		tutor.setup();
	}
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	
	void setup(){
         JFrame frame = new JFrame();
         frame.add(panel);
         panel.add(label);
         frame.setVisible(true);
         currentLetter = generateRandomLetter();
         String cl = String.valueOf(currentLetter);
         label.setText(cl);
         label.setFont(label.getFont().deriveFont(28.0f));
         label.setHorizontalAlignment(JLabel.CENTER);
         frame.addKeyListener(this);
         frame.pack();
    }

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		 currentLetter = generateRandomLetter();
         String cl = String.valueOf(currentLetter);
         label.setText(cl);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(currentLetter == arg0.getKeyChar()) {
			System.out.println("Correct");
			panel.setBackground(Color.green);
			correct++;
		}
		else {
			panel.setBackground(Color.red);
		}
		if(correct == 10) {
			showTypingSpeed(correct);
		}
	}
}
