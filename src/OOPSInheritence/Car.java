package OOPSInheritence;

public class Car extends Vehicle {
	
	public static void speed()
	{
		System.out.println("Car -- speed");
	}

	private void price()
	{
		System.out.println("Car -- price");
	}
	
	public void start()
	{
		System.out.println("Car -- start");
	}
	

	public void stop()
	{
		System.out.println("Car -- stop");
	}
	

	public void refuel()
	{
		System.out.println("Car -- refuel");
	}
	
	@Override
	public void engine()
	{
		System.out.println("Car ---- overriden --- engine");
	}
}
