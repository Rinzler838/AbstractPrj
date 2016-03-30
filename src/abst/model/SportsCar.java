package abst.model;

public abstract class SportsCar implements MovingThing
{
	private String modelName;
	private int seatingCapacity;
	private int topSpeed;
	private int price;
	private boolean isHybrid;

	public String getModelName()
	{
		return modelName;
	}
	
	public void setModelName(String modelName)
	{
		this.modelName = modelName;
	}
	
	public int getCapacity()
	{
		return seatingCapacity;
	}
	
	public void setSeatingCapacity(int seatingCapacity)
	{
		this.seatingCapacity = seatingCapacity;
	}
	
	public int getTopSpeed()
	{
		return topSpeed;
	}
	
	public void setTopSpeed(int topSpeed)
	{
		this.topSpeed = topSpeed;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}

	public boolean isHybrid()
	{
		return isHybrid;
	}

	public void setHybrid(boolean isHybrid)
	{
		this.isHybrid = isHybrid;
	}
}
