package abst.model;

public interface MovingThing
{
	public String name();
	public int speed();
	public boolean isMoving();
	public  void moveThing(int speed);
}
