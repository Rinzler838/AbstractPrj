package abst.model;

/**
 * Interface 
 * @author Deigen Villalobos, Tyler Jarrard
 *
 */

public interface MovingThing
{
	public String name(String name);
	public int speed();
	public boolean isMoving();
	public void moveThing(int speed);
}
