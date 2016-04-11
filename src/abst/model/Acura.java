package abst.model;

import javax.swing.JOptionPane;

public class Acura extends SportsCar
{
	public Acura()
	{
		super();
		
		this.setModelName("Acura NSX 2017");
		this.setSeatingCapacity(2);
		this.setPrice(156000);
		this.setTopSpeed(191);
		this.setHybrid(true);
	}

	@Override
	public String name(String name)
	{
		name = "Acura NSX 2017";
		
		return name;
	}

	@Override
	public int speed()
	{
		return 191;
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
