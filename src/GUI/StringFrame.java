package GUI;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class StringFrame extends JFrame {
	
	private classPanel currentPanel;
	
	public StringFrame()
	{
		currentPanel = new classPanel();
		
		setupFrame();
	}

	private void setupFrame() {
		this.setContentPane(currentPanel);
	}
	
	public void start()
	{
		this.setSize(900,500);
		this.setVisible(true);
	}

}
