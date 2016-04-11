package abst.model;

import javax.swing.JOptionPane;

public class Mammals extends FluffyThings implements MovingThing 
{
	public Mammals()
	{
		super();
	}

	public String size()
	{
		return "varies";
	}

	public String group()
	{
		return "Mammals";
	}


	public double goodnessScale()
	{
		return 7.0;
	}

	@Override
	public String name(String name)
	{
		name = "Mammals";
		return name;
	}

	@Override
	public int speed()
	{
		return 7;
	}

	@Override
	public boolean isMoving()
	{
		return true;
	}

	@Override
	public void moveThing(int speed)
	{
		for (int current = 0; current < speed; current++)
		{
			JOptionPane.showMessageDialog(null, "I moved!!!");
		}
	}
}
