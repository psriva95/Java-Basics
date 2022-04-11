package ExceptionHandling;
public class ThrowsKeyword {

	public void m1() 
	{
		m2();
	}
	public void m2() 
	{
		m3();
	}
	public void m3() 
	{
		try{     /////second best practice to handle in caller method
			m4();
		}
		catch(Exception e )
		{
			e.printStackTrace();;
		}
	}
	public void m4() throws ArithmeticException
	{
		int i = 9/0; // best practice to handle it here
	}
	public static void main(String[] args) {

			ThrowsKeyword t = new ThrowsKeyword();
			try   ///////////// bad practice to include exception handling in main
			{
				t.m1();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("bye");
	}

}
