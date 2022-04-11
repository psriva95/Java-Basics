package JavaSessions;

public class MaxOfFourNumbers {

	public static void main(String[] args)
	{
		int w = 400;
		int x = 10050;
		int y = 300;
		int z = 1230;
		
		if(w>x && w>y && w>z)
			System.out.println("W is greates");
		else if ( x>y && x>z)
			System.out.println("X is greatest");
		else if(y>z)
			System.out.println("Y is greatest");
		else 
			System.out.println("Z is greatest");
	}
	
}
