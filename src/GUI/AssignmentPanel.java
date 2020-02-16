package GUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AssignmentPanel extends JPanel {
	private JTextField txtMyAssignments;
	private JTextField textField;
	private JTextField textField_1;
	public AssignmentPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JList list = new JList();
		list.setBounds(179, 15, 0, 0);
		add(list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(274, 14, 2, 2);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(0, 0, 120, 300);
		add(panel);
		
		JButton btnNewButton = new JButton("My Classmates");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("My Assignments");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Notifications");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("My Study Groups");
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(118, 0, 158, 300);
		add(panel_1);
		
		txtMyAssignments = new JTextField();
		txtMyAssignments.setHorizontalAlignment(SwingConstants.CENTER);
		txtMyAssignments.setForeground(Color.WHITE);
		txtMyAssignments.setText("My Assignments");
		txtMyAssignments.setBackground(Color.GRAY);
		panel_1.add(txtMyAssignments);
		txtMyAssignments.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("+ Create Collaboration");
		btnNewButton_4.setBounds(286, 12, 154, 21);
		add(btnNewButton_4);
		
		
		
	}
}
