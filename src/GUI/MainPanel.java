package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import CalgaryHacks2020.Event;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {

	private int currentWeek = 0;//the current week of the schedule we are looking at
	private Object[][] data;

    public MainPanel() {
    	setBackground(Color.LIGHT_GRAY);



        String[] columnNames = {"Sun","Mon","Tue","Wend","Thurs","Fri","Sat"};

        data = new Object[][] {
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
	    {null, null,null, null, null,null,null},
        };
        setLayout(null);

        updateCalander();


        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 100));
        table.setFillsViewportHeight(true);

        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(270, 50, 600, 450);

        //Add the scroll pane to this panel.
        add(scrollPane);

        JLabel weekNumberLb = new JLabel("current week: " + currentWeek);
        weekNumberLb.setBounds(540, 20, 100, 14);
        add(weekNumberLb);

        JButton scrollCalanderLeftBt = new JButton("<--");
        scrollCalanderLeftBt.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		if (currentWeek > 0)
        		{
        			currentWeek--;
        			updateCalander();
        		}
        		weekNumberLb.setText("current week: " + currentWeek);
        	}
        });
        scrollCalanderLeftBt.setBounds(270, 16, 89, 23);
        add(scrollCalanderLeftBt);

        JButton scrollCalanderRightBt = new JButton("-->");
        scrollCalanderRightBt.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if (currentWeek < 12)
		        {
		        	currentWeek++;
		        	updateCalander();
		        }
        		weekNumberLb.setText("current week: " + currentWeek);
        	}
        });
        scrollCalanderRightBt.setBounds(781, 16, 89, 23);
        add(scrollCalanderRightBt);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setBounds(0, 0, 200, 500);
        add(panel);
        GridBagLayout gbl_panel = new GridBagLayout();
        gbl_panel.columnWidths = new int[]{45, 0};
        gbl_panel.rowHeights = new int[]{71, 71, 71, 71, 71, 71, 71, 0};
        gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel.setLayout(gbl_panel);

        JButton myClassesBt = new JButton("My Classes");
        GridBagConstraints gbc_myClassesBt = new GridBagConstraints();
        gbc_myClassesBt.insets = new Insets(0, 0, 5, 0);
        gbc_myClassesBt.fill = GridBagConstraints.BOTH;
        gbc_myClassesBt.gridx = 0;
        gbc_myClassesBt.gridy = 0;
        panel.add(myClassesBt, gbc_myClassesBt);
        myClassesBt.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(CalgaryHacks2020.CalgaryHacks2020.classPanel);
        	}
        });

        JButton myGroupsBt = new JButton("My Groups");
        myGroupsBt.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(CalgaryHacks2020.CalgaryHacks2020.groupsPanel);
        	}
        });

        JButton myAssignmentsBt = new JButton("My Assignments");
        myAssignmentsBt.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(CalgaryHacks2020.CalgaryHacks2020.assignmentPanel);
        	}
        });
        GridBagConstraints gbc_myAssignmentsBt = new GridBagConstraints();
        gbc_myAssignmentsBt.fill = GridBagConstraints.BOTH;
        gbc_myAssignmentsBt.insets = new Insets(0, 0, 5, 0);
        gbc_myAssignmentsBt.gridx = 0;
        gbc_myAssignmentsBt.gridy = 1;
        panel.add(myAssignmentsBt, gbc_myAssignmentsBt);

        JButton myNotificationsBt = new JButton("My Notifications");
        myNotificationsBt.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(CalgaryHacks2020.CalgaryHacks2020.notificationPanel);
        	}
        });
        GridBagConstraints gbc_myNotificationsBt = new GridBagConstraints();
        gbc_myNotificationsBt.fill = GridBagConstraints.BOTH;
        gbc_myNotificationsBt.insets = new Insets(0, 0, 5, 0);
        gbc_myNotificationsBt.gridx = 0;
        gbc_myNotificationsBt.gridy = 2;
        panel.add(myNotificationsBt, gbc_myNotificationsBt);
        GridBagConstraints gbc_myGroupsBt = new GridBagConstraints();
        gbc_myGroupsBt.fill = GridBagConstraints.BOTH;
        gbc_myGroupsBt.insets = new Insets(0, 0, 5, 0);
        gbc_myGroupsBt.gridx = 0;
        gbc_myGroupsBt.gridy = 3;
        panel.add(myGroupsBt, gbc_myGroupsBt);


    }

	private void updateCalander() {
		//update the data with times when the schedule has an event
        Event[][][] sched = CalgaryHacks2020.CalgaryHacks2020.user.getStudentSchedule().getTempSchedule();
        for (int i = 0; i < 7; i++)//for each day
        {
        	for (int j = 0; j < 24;j++)//for each hour in that day
        	{
        		if (sched[currentWeek][i][j].getEventType() != "FREETIME")
        		{
        			data[j][i] = sched[currentWeek][i][j].getClassName();
        		}
        	}
        }
	}
}