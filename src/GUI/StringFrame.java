package GUI;

import javax.swing.JFrame;

public class StringFrame extends JFrame {
	
	private StringPanel currentPanel;
	
	public StringFrame()
	{
		currentPanel = new StringPanel();
		
		setupFrame();
	}

	private void setupFrame() {
		this.setContentPane(currentPanel);
	}
	
	public void start()
	{
		this.setSize(500,500);
		this.setVisible(true);
	}

}
