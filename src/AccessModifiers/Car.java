package AccessModifiers;

public class Car {

	public String name;
	private int price;
	protected int licNumber;
	String color;
	
	public static void main(String[] args)
	{
		Car c = new Car();
		c.color = "Red";
		c.price = 100;
		
	}
}
