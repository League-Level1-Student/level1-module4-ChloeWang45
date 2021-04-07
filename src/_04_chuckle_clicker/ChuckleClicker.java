package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
		
		ChuckleClicker a = new ChuckleClicker();
		a.makeButtons();
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton("Joke");
	JButton punchline = new JButton("Punchline");
	
	void makeButtons() {
		
		panel.add(joke);
		panel.add(punchline);
		frame.add(panel);
		frame.setVisible(true);
		joke.addActionListener(this);
		punchline.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stu
		 JButton buttonPressed = (JButton) arg0.getSource();
		 if(joke == buttonPressed) {
			 JOptionPane.showMessageDialog(null, "What do you call a bear with no teeth?");
		 }
		 else {
			 JOptionPane.showMessageDialog(null, "A gummy bear!");
		 }
	}
}
