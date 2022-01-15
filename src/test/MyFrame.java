package test;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {
	public MyFrame() {
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button = new JButton("New button");
		getContentPane().add(button);
		
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton);
	}

}
