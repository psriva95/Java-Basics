package OOPSInheritence;

public class BMW extends Car

{
	public static void speed()    //Method Hiding
	{
		System.out.println("BMW -- speed");
	}
	
	private void price()    //Not inherited
	{
		System.out.println("BMW --- price");
	}
	
	
	@Override
	public void start()   //Inherited
	{
		System.out.println("BMW -- start");
	}
	

	public void autoParking()
	{
		System.out.println("BMW -- autoParking");
	}
	
}
