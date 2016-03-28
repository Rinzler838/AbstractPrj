package abst.model;

public abstract class Car
{
	private String modelName;
	private int passengerNumber;
	private int topSpeed;
	private int price;

	public String getModelName()
	{
		return modelName;
	}
	
	public void setModelName(String modelName)
	{
		this.modelName = modelName;
	}
	
	public int getPassengerNumber()
	{
		return passengerNumber;
	}
	
	public void setPassengerNumber(int passengerNumber)
	{
		this.passengerNumber = passengerNumber;
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
}
