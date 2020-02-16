package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
 
public class classPanel extends JPanel {
	
	private JLabel classes;
	
	public classPanel() {
		classes = new JLabel("My Classes");
		classes.setHorizontalAlignment(SwingConstants.LEFT);
	
		setupPanel();
	}

	private void setupPanel() {
		setBackground(Color.lightGray);
		this.add(classes);
	}	
}