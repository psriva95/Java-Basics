package OOPSAbstraction;

public class TestPage {

	public static void main(String[] args) {
	
		HomePage home = new HomePage(5);
		home.title();
		home.timeout();
		home.url();
		home.logo();
		
		System.out.println("~~~~~~~~~~~~~~~~~");
		
		LoginPage loginPage = new LoginPage();
		loginPage.title();
		loginPage.timeout();
		loginPage.url();
		loginPage.logo();
		loginPage.doLogin();
		
		System.out.println("~~~~~~~~~~~~~~~~~");
		
		//top casting
		Page p = new LoginPage();
		p.timeout();
		p.logo();
		p.title();
		p.url();
	    //p.doLogin() cannot call
		
	}

}
