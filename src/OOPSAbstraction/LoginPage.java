package OOPSAbstraction;

public class LoginPage extends Page{

	@Override
	public void title() {
		System.out.println("login page  title");
		
	}

	@Override
	public void url() {
		System.out.println("login page  url");
		
	}
	
	@Override
	public void timeout()
	{
		System.out.println("Time out is 5 secs");
	}
	
	public void doLogin()
	{
		System.out.println("Login from loginpage");
	}
}
