package abst.view;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import abst.controller.InheritanceController;

public class InheritancePanel
{
	private InheritanceController baseController;
	private JButton abstButton;
	private JTextField abstField;
	private SpringLayout baseLayout;

	public InheritancePanel(InheritanceController baseController)
	{		
		this.baseController = baseController;
	
		baseLayout = new SpringLayout();
		abstButton = new JButton("Click this button...");
		abstField = new JTextField("You type words in here...");
	
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(abstButton);
		this.add(abstField);
	}

	private void setupLayout()
	{
	
	}

	private void setupListeners()
	{
	
	}

}
