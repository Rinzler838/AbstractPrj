package abst.view;

import javax.swing.JFrame;
import abst.controller.InheritanceController;


public class InheritanceFrame extends JFrame
{
	private InheritanceController baseController;
	private InheritancePanel basePanel;
		
	public InheritanceFrame()
	{
		this.baseController = baseController;
		basePanel = new InheritancePanel(baseController);
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(800,720);
		this.setTitle("Inheritance Prj");
		this.setResizable(false);
		this.setVisible(true);
	}
}
