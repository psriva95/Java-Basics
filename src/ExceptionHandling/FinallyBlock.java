package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args)
	{
		System.out.println("A");
		try {
			int i = 9/3;
		}
		catch(ArithmeticException e)
		{
			System.out.println("AE is coming");
		}
		finally {
			System.out.println("Inside Finally Block");
		}
	}
	
}
