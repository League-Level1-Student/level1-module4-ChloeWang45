package _12_slot_machine;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {

	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	Random rand = new Random();
	JLabel cherry = new JLabel();
	JLabel lime = new JLabel();
	JLabel orange = new JLabel();
	
	public SlotMachine() {
		
		for(int i = 0; i < 3; i++) {
			int r = rand.nextInt(3);
			if(r == 0) {
				try {
					cherry = createLabelImage("cherry.jpg");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				cherry.setPreferredSize(new Dimension(600, 600));
				panel.add(cherry);
			}
			else if(r == 1) {
				try {
					lime = createLabelImage("lime.jpg");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				lime.setPreferredSize(new Dimension(600, 600));
				panel.add(lime);
			}
			else if(r == 2) {
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
