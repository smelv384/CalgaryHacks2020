package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import CalgaryHacks2020.Invite;

@SuppressWarnings("serial")
public class NotificationPanel extends JPanel {

    ArrayList<Invite> data = new ArrayList<>();

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


        String[] columnNames = {"Group Invitations"};

        setLayout(null);


        Invite[][] otherData = new Invite[26][1];
        for (int i = 0; i < data.size();i++)
        {
            otherData[i][0] = data.get(i);
        }
        final JTable table = new JTable(otherData, columnNames);
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent arg0) {
                if (table.getSelectedRow() != -1)
                {
                    //convert the arraylist into a array the table can use
                    for (int i = 0; i < data.size();i++)
                    {
                        otherData[i][0] = data.get(i);
                    }
                    //TOTO: add something to do with sending invites to the other users

                }
            }
        });

        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setPreferredScrollableViewportSize(new Dimension(500, 100));
        table.setFillsViewportHeight(true);

        JButton btnNewButton = new JButton("Accept Invitation");
        btnNewButton.setEnabled(false);

        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
        table.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
        		//toggle if the accept invitation button is enabled or not
        		if (table.getSelectedRow() != -1)
        		{
        			btnNewButton.setEnabled(true);
        		}
        		else
        		{
        			btnNewButton.setEnabled(false);
        		}
        	}
        });
        scrollPane.setBounds(240, 26, 222, 450);


        //Add the scroll pane to this panel.
        add(scrollPane);

        //if the accept button is clicked call the accept collab request function
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if (table.getSelectedRow() != -1)//if there is something selected
        		{
        			CalgaryHacks2020.CalgaryHacks2020.acceptCollabRequest(CalgaryHacks2020.CalgaryHacks2020.userInvitations, table.getSelectedRow());
        		}
        	}
        });
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBackground(new Color(173, 255, 47));
        btnNewButton.setBounds(472, 26, 149, 62);
        add(btnNewButton);

        /*
        JButton refreshBt = new JButton("Refresh");
        refreshBt.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		Invite[][] temporary = new Invite[CalgaryHacks2020.CalgaryHacks2020.userInvitations.size()][1];
        		int count = 0;
        		for (Invite i : CalgaryHacks2020.CalgaryHacks2020.userInvitations)
        		{
        			temporary[count][0] = i;
        			count ++;
        		}
        		data = temporary;
        	}
        });
        refreshBt.setBounds(472, 99, 149, 62);
        add(refreshBt);
        */
	}

	public void addInviteToList(Invite invitation) {
	    data.add(invitation);
	}
}
