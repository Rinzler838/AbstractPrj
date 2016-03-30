package abst.controller;

import java.util.ArrayList;

import abst.model.*;

public class InheritanceController 
{
	private ArrayList <MovingThing> movingThings;
	
	public String Race()
	{
		String moving = "";
		for (int current = 0; current < movingThings.size(); current++)
		{
			  
		}
		return moving;
	}
	
	private void makeMovingList()
	{
		movingThings.add(new Acura());
		movingThings.add(new Ferrari());
		movingThings.add(new Mclaren());
		movingThings.add(new Mammals());
		
	}
}
