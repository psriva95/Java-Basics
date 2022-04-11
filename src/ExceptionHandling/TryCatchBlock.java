package ExceptionHandling;

public class TryCatchBlock {

	int age ;
	public static void main(String[] args) {
		TryCatchBlock r = new TryCatchBlock();
		r = null;
		System.out.println("A");
		int a[] = new int[3];
		try {
			int i = 9/2; //AE
			a[1] = 10;  //AIOB
			r.age = 10;  //NPE
			System.out.println("Hello");
		}
		catch(ArrayIndexOutOfBoundsException e )
		{
			System.out.println("Error AIOB..");
			e.printStackTrace();
		}
		catch(ArithmeticException e )
		{
			System.out.println("Error AE..");
			e.printStackTrace();
		}
		catch(NullPointerException e )
		{
			int i = 9/0;
			System.out.println("Error NPE..");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Some error is coming");
		}
		System.out.println("After try ");

	}

}
