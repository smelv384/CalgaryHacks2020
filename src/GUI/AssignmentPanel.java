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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		
		JButton myClassesBt = new JButton("My Classes");
		myClassesBt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(CalgaryHacks2020.CalgaryHacks2020.classPanel);
			}
		});
		panel.add(myClassesBt);
		
		JButton btnNewButton_1 = new JButton("My Assignments");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(CalgaryHacks2020.CalgaryHacks2020.mainPanel);
			}
		});
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBackground(Color.GRAY);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Notifications");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(CalgaryHacks2020.CalgaryHacks2020.notificationPanel);
			}
		});
		panel.add(btnNewButton_2);
		
		JButton myGroupsButton = new JButton("My Groups");
		myGroupsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(CalgaryHacks2020.CalgaryHacks2020.groupsPanel);
			}
		});
		panel.add(myGroupsButton);
		
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
