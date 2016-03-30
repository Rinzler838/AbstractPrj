package abst.model;

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

	@Override
	public String name()
	{
		String name = "Ferrari LaFerrari";
		
		return null;
	}

	@Override
	public int speed()
	{
		return 227;
	}

	@Override
	public boolean isMoving()
	{
		return true;
	}

	@Override
	public void moveThing(int speed)
	{
		
	}
}