package OOPSInheritence;

public class Audi extends Car {

	public void theftSafety()
	{
		System.out.println("Audi --- Theft Safety");
	}
	
	@Override
	public void engine()
	{
		System.out.println("Audi --- engine");
	}
}
