package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;

@SuppressWarnings("serial")
public class NotificationPanel extends JPanel {
	public NotificationPanel() {
		setLayout(null);
		
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
		
		JButton myClasseBt = new JButton("My Classes");
		GridBagConstraints gbc_myClasseBt = new GridBagConstraints();
		gbc_myClasseBt.fill = GridBagConstraints.BOTH;
		gbc_myClasseBt.insets = new Insets(0, 0, 5, 0);
		gbc_myClasseBt.gridx = 0;
		gbc_myClasseBt.gridy = 0;
		panel.add(myClasseBt, gbc_myClasseBt);
		myClasseBt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(CalgaryHacks2020.CalgaryHacks2020.classPanel);
			}
		});
		
		JButton myAssignmentsBt = new JButton("My Assignments");
		GridBagConstraints gbc_myAssignmentsBt = new GridBagConstraints();
		gbc_myAssignmentsBt.fill = GridBagConstraints.BOTH;
		gbc_myAssignmentsBt.insets = new Insets(0, 0, 5, 0);
		gbc_myAssignmentsBt.gridx = 0;
		gbc_myAssignmentsBt.gridy = 1;
		panel.add(myAssignmentsBt, gbc_myAssignmentsBt);
		myAssignmentsBt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(CalgaryHacks2020.CalgaryHacks2020.assignmentPanel);
			}
		});
		
		JButton myNotificationsBt = new JButton("My Notifications");
		myNotificationsBt.setBackground(Color.DARK_GRAY);
		myNotificationsBt.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_myNotificationsBt = new GridBagConstraints();
		gbc_myNotificationsBt.fill = GridBagConstraints.BOTH;
		gbc_myNotificationsBt.insets = new Insets(0, 0, 5, 0);
		gbc_myNotificationsBt.gridx = 0;
		gbc_myNotificationsBt.gridy = 2;
		panel.add(myNotificationsBt, gbc_myNotificationsBt);
		myNotificationsBt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(CalgaryHacks2020.CalgaryHacks2020.mainPanel);
			}
		});
		
		JButton myGroupsBt = new JButton("My Groups");
		GridBagConstraints gbc_myGroupsBt = new GridBagConstraints();
		gbc_myGroupsBt.fill = GridBagConstraints.BOTH;
		gbc_myGroupsBt.insets = new Insets(0, 0, 5, 0);
		gbc_myGroupsBt.gridx = 0;
		gbc_myGroupsBt.gridy = 3;
		panel.add(myGroupsBt, gbc_myGroupsBt);
		myGroupsBt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(CalgaryHacks2020.CalgaryHacks2020.groupsPanel);
			}
		});
	}

}
