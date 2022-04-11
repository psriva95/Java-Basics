package ExceptionHandling;

public class Student {

	public static int getMarks(String name)
	{
		System.out.println("Student Name "+ name);
		if(name.equals("Pooja"))
		{
			try {
				int i = 10/0;
				return 80;
			}
			catch (ArithmeticException e) {
				System.out.println("SOme exec is coming");
				return 90;
			}
			finally {
				//return 70;
				System.out.println("Bye");
				return 77;
			}
		}
		else if(name.equals("Rajat"))
				{
			return 90;
				}
				else
				{
					System.out.println("Not available");
					return -1;
				}
	}
	public static void main(String[] args) {

		int m1 = getMarks("Pooja");
		System.out.println(m1);

	}

}
