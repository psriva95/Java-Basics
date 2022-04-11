package WebDriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.getTitle();
		driver.getUrl();
		driver.findElement("submit");
		driver.quit();
		
	}

}
