package abst.controller;

import java.util.ArrayList;
import abst.model.*;

/**
 * @author Deigen Villalobos, Tyler Jarrard
 */

public class InheritanceController 
{
	private ArrayList <MovingThing> movingThings;
	
	public String Race()
	{
		String moving = "";
		for (MovingThing current : movingThings)
		{
			if (current.isMoving() == true)
			{
				moving = current.name(moving) + " is moving at a speed of" + current.speed();
			}
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
