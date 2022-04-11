package JavaSessions;

import java.util.Arrays;
import java.util.List;

public class RoleBasedAccessControlUsingSwitch {

	public static void main(String[] args)
	{
		List<String> menu ;
		String role = "Admin";
		
		switch (role) {
		case "Admin": menu = Arrays.asList("Create User", 
				"Change User Access", "Modify User Details","Update Delete/Password");
		System.out.println(menu);
			break;

		case "Super Admin": menu = Arrays.asList("Create User", 
				"Change User Access", "Modify User Details","Update Delete/Password","Modify Admin Rights");
		System.out.println(menu);
			break;
			
		case "Vendor": menu = Arrays.asList("Buy Product");
		System.out.println(menu);
			break;
			
		case "Seller": menu = Arrays.asList("Sell Product");
		System.out.println(menu);
			break;
			
			
		default:
			System.out.println("Invalid User Passed");
			break;
		}
		
	}
	
}
