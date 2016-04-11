package abst.model;

import javax.swing.JOptionPane;

public class Mclaren extends SportsCar
{
	public Mclaren()
	{
		super();
		
		this.setModelName("Mclaren P1");
		this.setSeatingCapacity(2);
		this.setPrice(1150000);
		this.setTopSpeed(217);
		this.setHybrid(true);
	}

	@Override
	public String name(String name)
	{
		name = "Mclaren P1";
		
		return name;
	}

	@Override
	public int speed()
	{
		return 217;
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
