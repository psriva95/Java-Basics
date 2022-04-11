package Assignment;

public class BrowserTest {

	public static void main(String[] args)
	{
		String[] plugin = new String[2];
		plugin[0] = "SelectorsHub";
		plugin[1] = "MusicAllTime";
		Browser browser = new Browser("Chrome", 81.9, plugin);
		
		System.out.println(browser.getName());
		for(int i = 0;i<plugin.length;i++)
				System.out.println(plugin[i]);
		System.out.println(browser.getVersion());
	}
}
