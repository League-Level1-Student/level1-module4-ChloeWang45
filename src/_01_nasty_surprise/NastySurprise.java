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

public class NastySurprise implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton trick = new JButton("Trick");
	JButton treat = new JButton("Treat");
	
	NastySurprise(){
		panel.add(trick);
		panel.add(treat);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		trick.addActionListener(this);
		treat.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
	
		NastySurprise n = new NastySurprise();
		
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if(trick == buttonPressed) {
			showPictureFromTheInternet("http://images6.fanpop.com/image/photos/43100000/cute-puppy-dogs-43117550-736-736.jpg");
		}
		else if(treat == buttonPressed) {
			showPictureFromTheInternet("https://vsthemes.org/uploads/posts/2021-01/1609981359_1551894329_scary-face-live-wallpaper-for-windows.jpg");
		}
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
}
