package GUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;

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
        scrollPane.setBounds(270, 25, 600, 450);

        //Add the scroll pane to this panel.
        add(scrollPane);
    }

}