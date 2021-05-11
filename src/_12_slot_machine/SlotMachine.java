package _12_slot_machine;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine {

	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	Random ran1 = new Random();
	Random ran2 = new Random();
	Random ran3 = new Random();
	JLabel cherry = new JLabel();
	JLabel lime = new JLabel();
	JLabel orange = new JLabel();
	
	public SlotMachine() {
		
		int r1 = ran1.nextInt(3);
		int r2 = ran2.nextInt(3);
		int r3 = ran3.nextInt(3);
		
			
			if(r1 == 0) {
				try {
					cherry = createLabelImage("cherry.jpg");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				cherry.setPreferredSize(new Dimension(600, 600));
				panel.add(cherry);
			}
			else if(r1 == 1) {
				try {
					lime = createLabelImage("lime.jpg");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				lime.setPreferredSize(new Dimension(600, 600));
				panel.add(lime);
			}
			else if(r1 == 2) {
				try {
					orange = createLabelImage("orange.jpg");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				orange.setPreferredSize(new Dimension(600, 600));
				panel.add(orange);
			}
			
			if(r2 == 0) {
				try {
					cherry = createLabelImage("cherry.jpg");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				cherry.setPreferredSize(new Dimension(600, 600));
				panel.add(cherry);
			}
			else if(r2 == 1) {
				try {
					lime = createLabelImage("lime.jpg");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				lime.setPreferredSize(new Dimension(600, 600));
				panel.add(lime);
			}
			else if(r2 == 2) {
				try {
					orange = createLabelImage("orange.jpg");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				orange.setPreferredSize(new Dimension(600, 600));
				panel.add(orange);
			}
			
			if(r3 == 0) {
				try {
					cherry = createLabelImage("cherry.jpg");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				cherry.setPreferredSize(new Dimension(600, 600));
				panel.add(cherry);
			}
			else if(r3 == 1) {
				try {
					lime = createLabelImage("lime.jpg");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				lime.setPreferredSize(new Dimension(600, 600));
				panel.add(lime);
			}
			else if(r3 == 2) {
				try {
					orange = createLabelImage("orange.jpg");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				orange.setPreferredSize(new Dimension(600, 600));
				panel.add(orange);
			}
			
			frame.add(panel);
			frame.setVisible(true);
			frame.pack();
			
			int wins = 0;
			if(r1 == r2 && r2 == r3) {
				wins++;
				JOptionPane.showMessageDialog(null, "YOU WIN! You have won " + wins + " times.");
			}
		}
	
	
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
}
