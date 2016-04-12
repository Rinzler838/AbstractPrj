package abst.model;

public abstract class SportsCar implements MovingThing, Comparable
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
	
	public String toString()
	{
		String description = "This is a " + this.getClass().getName() + " that has a speed of: " + speed();
		
		return description;
	}

	/**
	 * If the supplied variable compared comes before the calling variable
	 * - Return -1
	 * If the supplied variable is after the calling variable 
	 * - Return 1
	 * Else they are the same
	 * - Return 0
	 */
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if (compared instanceof MovingThing)
		{
			if (this.speed() > ((MovingThing) compared).speed())
			{
				comparedValue = 1;
			}
			else if (this.speed() < ((MovingThing) compared).speed())
			{
				comparedValue = -1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		return comparedValue;
	}
}
