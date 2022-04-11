package WebDriver_Arch;

public interface WebDriver extends SearchContext{

	public void click();
	public void sendkeys(String value);
	public String getTitle();
	public String getUrl();
	public void quit();
}
