package GUI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AvailableGroups extends JPanel{
	public AvailableGroups() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.lightGray);
		panel.setBounds(0, 0, 116, 300);
		add(panel);

		JButton btnNewButton = new JButton("My Classes");
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("My Assignments");
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Notifications");
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("My Study Groups");
		btnNewButton_3.setVisible(false);
		panel.add(btnNewButton_3);

	}

}
