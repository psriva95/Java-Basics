package SuperKeyword;

public class Company implements Fund {

	int salary=100;;
	
	public Company()
	{
		System.out.println("Comp --- COnstr");
	}
	
	public Company(String s)
	{
		System.out.println("Comp Param const --- " + s);
	}
	
	public void cafe()
	{
		System.out.println("Comp--- cafe");
		System.out.println(salary);
	}
	
	public static void logo() {
		System.out.println("comp ----logo");
	}
}
