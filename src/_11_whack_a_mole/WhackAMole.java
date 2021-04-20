package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton a = new JButton();
	JButton b = new JButton();
	JButton c = new JButton();
	JButton d = new JButton();
	JButton e = new JButton();
	JButton f = new JButton();
	JButton g = new JButton();
	JButton h = new JButton();
	JButton i = new JButton();
	JButton j = new JButton();
	JButton k = new JButton();
	JButton l = new JButton();
	
	public WhackAMole() {
		
		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
		d.addActionListener(this);
		e.addActionListener(this);
		f.addActionListener(this);
		g.addActionListener(this);
		h.addActionListener(this);
		i.addActionListener(this);
		j.addActionListener(this);
		k.addActionListener(this);
		l.addActionListener(this);
		panel.add(a);
		panel.add(b);
		panel.add(c);
		panel.add(d);
		panel.add(e);
		panel.add(f);
		panel.add(g);
		panel.add(h);
		panel.add(i);
		panel.add(j);
		panel.add(k);
		panel.add(l);
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	}
	
	void drawButtons(int mole) {
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
