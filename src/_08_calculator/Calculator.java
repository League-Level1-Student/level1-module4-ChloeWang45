package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add");
	JButton subtract = new JButton("Subtract");
	JButton multiply = new JButton("Multiply");
	JButton divide = new JButton("Divide");
	JTextField input1 = new JTextField(5);
	JTextField input2 = new JTextField(5);
	
	public Calculator() {
	
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		panel.add(input1);
		panel.add(input2);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	
	
	public void add(int x, int y) {
		JOptionPane.showMessageDialog(null, x + " + " + y + " = " + (x + y));
	}
	
	public void subtract(int x, int y) {
		JOptionPane.showMessageDialog(null, x + " - " + y + " = " + (x - y));
	}
	
	public void multiply(int x, int y) {
		JOptionPane.showMessageDialog(null, x + " * " + y + " = " + (x * y));
	}
	
	public void divide(int x, int y) {
		JOptionPane.showMessageDialog(null, x + " ÷ " + y + " = " + (x / y));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String i1 = input1.getText();
		String i2 = input2.getText();
		int x = Integer.parseInt(i1);
		int y = Integer.parseInt(i2);
		if(e.getSource() == add) {
			add(x, y);
		}
		else if(e.getSource() == subtract) {
			subtract(x, y);
		}
		else if(e.getSource() == multiply) {
			multiply(x, y);
		}
		else {
			divide(x, y);
		}
		
	}
}
