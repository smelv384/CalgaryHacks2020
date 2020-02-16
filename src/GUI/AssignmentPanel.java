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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

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
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 200, 500);
		add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{200, 0};
		gbl_panel.rowHeights = new int[]{71, 71, 71, 71, 71, 71, 71, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNewButton_2 = new JButton("My Notifications");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(CalgaryHacks2020.CalgaryHacks2020.notificationPanel);
			}
		});
		
		JButton myClassesBt = new JButton("My Classes");
		myClassesBt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(CalgaryHacks2020.CalgaryHacks2020.classPanel);
			}
		});
		GridBagConstraints gbc_myClassesBt = new GridBagConstraints();
		gbc_myClassesBt.fill = GridBagConstraints.BOTH;
		gbc_myClassesBt.insets = new Insets(0, 0, 5, 0);
		gbc_myClassesBt.gridx = 0;
		gbc_myClassesBt.gridy = 0;
		panel.add(myClassesBt, gbc_myClassesBt);
		
		JButton btnNewButton_1 = new JButton("My Assignments");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(CalgaryHacks2020.CalgaryHacks2020.mainPanel);
			}
		});
		btnNewButton_1.setForeground(Color.LIGHT_GRAY);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 1;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 2;
		panel.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton myGroupsButton = new JButton("My Groups");
		myGroupsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(CalgaryHacks2020.CalgaryHacks2020.groupsPanel);
			}
		});
		GridBagConstraints gbc_myGroupsButton = new GridBagConstraints();
		gbc_myGroupsButton.fill = GridBagConstraints.BOTH;
		gbc_myGroupsButton.insets = new Insets(0, 0, 5, 0);
		gbc_myGroupsButton.gridx = 0;
		gbc_myGroupsButton.gridy = 3;
		panel.add(myGroupsButton, gbc_myGroupsButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(465, 15, 158, 300);
		add(panel_1);
		
		txtMyAssignments = new JTextField();
		txtMyAssignments.setHorizontalAlignment(SwingConstants.CENTER);
		txtMyAssignments.setForeground(Color.WHITE);
		txtMyAssignments.setText("My Assignments");
		txtMyAssignments.setBackground(Color.GRAY);
		panel_1.add(txtMyAssignments);
		txtMyAssignments.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("+ Create Collaboration");
		btnNewButton_4.setBounds(665, 15, 154, 21);
		add(btnNewButton_4);
		
		
		
	}
}
