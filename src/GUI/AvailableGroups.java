package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;

public class AvailablrGroups extends JPanel{
	public AvailablrGroups() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(0, 0, 116, 300);
		add(panel);
		
		JButton btnNewButton = new JButton("My Classes");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("My Assignments");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Notifications");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("My Study Groups");
		panel.add(btnNewButton_3);
		
	}

}
