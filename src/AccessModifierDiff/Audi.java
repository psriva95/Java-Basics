package AccessModifierDiff;

import AccessModifiers.Car;

public class Audi extends Car{

	public static void main(String[] args) {


		Audi a = new Audi();
		a.licNumber = 100;
		a.name = "Audi";
		//protected and public accessible
		//private and default cannot access
	}

}
