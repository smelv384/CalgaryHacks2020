package GUI;

import javax.swing.*;
import java.awt.Color;

public class StringPanel extends JPanel {
	
	private JButton testButton;
	
	public StringPanel() 
	{
		testButton = new JButton("CLICK ME UWU");
		testButton.setHorizontalAlignment(SwingConstants.LEFT);
		
		setupPanel();
	}

	private void setupPanel()
	{
		setBackground(Color.MAGENTA);
		this.add(testButton);
		
		
	}
}
