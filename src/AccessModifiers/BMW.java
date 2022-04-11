package AccessModifiers;

public class BMW extends Car{

	public static void main(String[] args) {
		BMW b = new BMW();
		b.color = "Yes";
		//price not accessible
	}

}
