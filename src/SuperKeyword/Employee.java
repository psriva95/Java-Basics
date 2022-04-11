package SuperKeyword;

public class Employee extends Company {

	int salary = 200;;
	
	public Employee()
	{
		super("Hello");
		System.out.println("Emp --- COnstr");
	}
	
	public Employee(String s)
	{
		//super();
		System.out.println("Emp -- Param --COnst " + s);
	}
	public void cafe()
	{
		System.out.println("Emp--- cafe");
		System.out.println(salary);
		System.out.println(super.salary);
		super.cafe();
		super.logo();
	}
	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.cafe();
		
	//	Employee f = new Employee("Bye");
		
	}
}
