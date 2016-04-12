package abst.view;

import javax.swing.JFrame;
import abst.controller.InheritanceController;

public class InheritanceFrame extends JFrame
{
	private InheritanceController basicController;
	private InheritancePanel basePanel;
	
	public InheritanceFrame(InheritanceController baseController)
	{
		this.basicController = baseController;
		basePanel = new InheritancePanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500,500);
		this.setTitle("");
		this.setResizable(true);
		this.setVisible(true);
	}
}
