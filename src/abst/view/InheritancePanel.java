package abst.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import abst.controller.InheritanceController;
import abst.model.MovingThing;

public class InheritancePanel extends JPanel
{
	private InheritanceController baseController;
	private JButton sortButton;
	private JTextArea textArea;

	public InheritancePanel (InheritanceController baseController)
	{
		this.baseController = baseController;
		sortButton = new JButton("Sort");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		textArea = new JTextArea(2,20);
		this.add(textArea);
		this.add(sortButton);
	}
	
	private void setupLayout()
	{
	
	}

	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				textArea.setText(baseController.MovingSpeed());
				String temp = "The sorted contents are: \n";
				for (MovingThing current : baseController.getMovingThings())
				{
					temp += current.toString() + "\n";
				}
				textArea.setText(temp);
			}
		});
	}

}
