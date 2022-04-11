package OOPSAbstraction;

public class HomePage extends Page {

//	public HomePage()
//	{
//		super(5);
//		System.out.println("Home Classs Conts.........");
//	}
	
	public HomePage(int a )
	{
		System.out.println("Home class ---" + a);
	}
	
	@Override
	public void title() {
		System.out.println("Home page title ");
		
	}

	@Override
	public void url() {
		System.out.println(" home page url");
		
	}
	
	

	
}
