package abst.model;

/**
 * Implements the MovingThing and Comparable Interfaces
 * @author Deigen Villalobos
 *
 */
public class Ferrari extends SportsCar
{
	public Ferrari()
	{
		super();
		
		this.setModelName("Ferrari LaFerrari");
		this.setSeatingCapacity(2);
		this.setPrice(1416000);
		this.setTopSpeed(227);
		this.setHybrid(true);
	}

	public String name(String name)
	{
		name = "Ferrari LaFerrari";
		
		return name;
	}

	public int speed()
	{
		return 227;
	}

	public boolean isMoving()
	{
		return true;
	}

	public void moveThing(int speed)
	{
		for (int current = 0; current <= speed; current++)
		{
			if (current > 0)
			{
				System.out.println(isMoving());
			}
		}
	}
}