package abst.view;

import java.awt.ScrollPane;
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
	private JScrollPane textPane;

	public InheritancePanel (InheritanceController baseController)
	{
		this.baseController = baseController;
		sortButton = new JButton("Sort");
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPane()
	{
		textPane = new JScrollPane(textArea);
		textPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		textPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		textArea = new JTextArea();
		this.add(textArea);
		textArea.setText(baseController.MovingSpeed());
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
