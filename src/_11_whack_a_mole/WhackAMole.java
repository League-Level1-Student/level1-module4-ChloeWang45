package _11_whack_a_mole;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton mole = new JButton();
	Random rand = new Random();
	GridLayout layout = new GridLayout(8, 3);
	Date date = new Date();
	int missed = 0;
	int whacked = 0;
	
	public WhackAMole() {
		
		drawButtons();
		
	}
	
	void drawButtons() {
		frame = new JFrame();
		panel = new JPanel();
		panel.setLayout(layout);
		int moleNum = rand.nextInt(24);
			for(int i = 0; i < 24; i++) {
				JButton button = new JButton();
				button.addActionListener(this);
				panel.add(button);
				if(moleNum == i) {
					mole = button;
					button.setText("Mole");
				}
			}		
			frame.add(panel);
			frame.setSize(300, 300);
			frame.setVisible(true);
			
		}
		

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if(mole == buttonPressed) {
			whacked++;
		}
		else {
			System.out.println("YOU MISSED!!");
			missed++;
		}
		frame.dispose();
		
		if(missed == 5 || missed + whacked == 10) {
			if(missed == 5) {
				JOptionPane.showMessageDialog(null, "YOU LOST!!");
			}
			endGame(date, whacked);
		}
		else {
			drawButtons();
		}
	}
	
	 private void endGame(Date timeAtStart, int molesWhacked) { 
		    Date timeAtEnd = new Date();
		    JOptionPane.showMessageDialog(null, "Your whack rate is "
		            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
		                  + " moles per second.");
		}
}
