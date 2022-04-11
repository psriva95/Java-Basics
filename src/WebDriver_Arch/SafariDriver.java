package WebDriver_Arch;

public class SafariDriver implements WebDriver {

	public SafariDriver()
	{
		System.out.println("Launch Safari Browser");
	}


	@Override
	public void click() {
		System.out.println("Click on elements");
	}

	@Override
	public void sendkeys(String value) {
		System.out.println("enter value "+ value);
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "title";
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "https:///abc.com";
	}

	@Override
	public void quit() {
		System.out.println("quit..");
		
	}



	@Override
	public void findElements(String element) {
	System.out.println("findElements " + element);
		
	}



	@Override
	public void findElement(String element) {
		System.out.println("findElement " + element);
		
	}
}
