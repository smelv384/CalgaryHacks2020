package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
 
public class classPanel extends JPanel {
	
	private JLabel classes;
	private JList<String> classList = new JList<String>();
	private JButton inputAssignment;
	
	public classPanel() {
		classes = new JLabel("My Classes");
		classes.setBounds(100, 10, 65, 16);
		classes.setHorizontalAlignment(SwingConstants.CENTER);
		classList = new JList<String>();
		inputAssignment = new JButton ("Add assignment");
		inputAssignment.setBounds(300, 10, 90, 16);
		inputAssignment.setHorizontalAlignment(SwingConstants.CENTER);
	
		setupPanel();
	}

	private void setupPanel() {
		setBackground(Color.lightGray);
		setLayout(null);
		this.add(classes);
		classes.setBorder(new LineBorder(Color.BLACK));
		this.add(inputAssignment);
		inputAssignment.setBorder(new LineBorder(Color.BLACK));
	}
}