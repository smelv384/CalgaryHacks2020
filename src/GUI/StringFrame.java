package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class StringFrame extends JFrame {


	//private classPanel currentPanel;
	private JPanel currentPanel;


	public StringFrame()
	{
		currentPanel  = CalgaryHacks2020.CalgaryHacks2020.mainPanel;

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

	public void changePanel(JPanel panel)
	{
		this.currentPanel = panel;
		this.setContentPane(currentPanel);
		this.repaint();
		this.revalidate();
	}

}
