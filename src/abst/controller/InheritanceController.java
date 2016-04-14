package abst.controller;

import java.util.ArrayList;
import abst.model.*;

/**
 * @author Deigen Villalobos, Tyler Jarrard
 */

public class InheritanceController 
{
	private ArrayList <MovingThing> movingThings;
	
	public InheritanceController()
	{
		makeMovingList();
	}
	
	public String MovingSpeed()
	{
		String moving = "";
		for (MovingThing current : movingThings)
		{
			if (current.isMoving() == true)
			{
				moving.concat(current.name(moving) + " is moving at a speed of" + current.speed() + "\n");
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
	
	public void start()
	{
		
	}
	
	public void swap(int firstLocation, int secondLocation)
	{
		MovingThing temp = movingThings.get(firstLocation);
		movingThings.set(firstLocation, movingThings.get(secondLocation));
		movingThings.set(secondLocation, temp);
	}
	
	public void insertionSort()
	{
		for (int outerLoop = 1; outerLoop < movingThings.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while (innerLoop > 0 && (movingThings.get(innerLoop - 1).compareTo(movingThings.get(innerLoop)) > 0))
			{
				swap (innerLoop, outerLoop - 1);
				innerLoop--;
			}
		}
	}
}
