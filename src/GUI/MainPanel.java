package GUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {

    public MainPanel() {

        String[] columnNames = {"Sun","Mon","Tue","Wend","Thurs","Fri","Sat"};

        Object[][] data = {
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

        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 100));
        table.setFillsViewportHeight(true);

        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(270, 50, 600, 450);

        //Add the scroll pane to this panel.
        add(scrollPane);
        
        JButton scrollCalanderLeftBt = new JButton("<--");
        scrollCalanderLeftBt.setBounds(270, 16, 89, 23);
        add(scrollCalanderLeftBt);
        
        JButton scrollCalanderRightBt = new JButton("-->");
        scrollCalanderRightBt.setBounds(781, 16, 89, 23);
        add(scrollCalanderRightBt);
        
        JButton myClassesBt = new JButton("My Classes");
        myClassesBt.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		//CalgaryHacks2020.CalgaryHacks2020.stringFrame.changePanel(new ClassPanel());
        	}
        });
        myClassesBt.setBounds(32, 47, 109, 23);
        add(myClassesBt);
        
        JButton myAssignmentsBt = new JButton("My Assignments");
        myAssignmentsBt.setBounds(32, 106, 109, 23);
        add(myAssignmentsBt);
        
        JButton myNotificationsBt = new JButton("My Notifications");
        myNotificationsBt.setBounds(32, 167, 109, 23);
        add(myNotificationsBt);
        
        JButton myGroupsBt = new JButton("My Groups");
        myGroupsBt.setBounds(32, 232, 109, 23);
        add(myGroupsBt);
    }
}