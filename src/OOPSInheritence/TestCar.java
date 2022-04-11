package OOPSInheritence;

public class TestCar {

	public static void main(String[] args) {
		
		BMW bmw = new BMW();
		
		bmw.start();  //overridden method
		bmw.stop();  //inherited method
		bmw.autoParking(); //individual method
		bmw.refuel(); //inherited 
		bmw.engine();
		
		System.out.println("-------------------------");
		
		BMW.speed();
		Car.speed();
		
		System.out.println("-------------------------");
		
		Car car = new Car();
		car.start();
		car.stop();
		car.refuel();
		car.engine();
		
		System.out.println("-------------------------");
		
		
		new BMW(); // no ref object
		
		Car c = new BMW();
		c.start();  //child class start method will be called
		c.stop();
		c.refuel();
		//c.autoParking(); not accessible from this ------------ REFERENCE TYPE CHECK
		c.engine();
		
		System.out.println("-------------------------");
		
		Vehicle v1 = new BMW();
		v1.engine();
		
		Vehicle v2 = new Vehicle();
		v2.engine();
		// BMW bmw2 = new Car(); //down casting is not allowed.
		
		//BMW bmw2 = (BMW) new Car(); //class cast exception
		//bmw2.start();
		
		
		//BMW be = (BMW) new Vehicle();  //class cast exception
		System.out.println("-------------------------");
		Audi a = new Audi();
		a.start();
		a.stop();
		a.refuel();
		a.engine();
		a.theftSafety();
		
		System.out.println("-------------------------");
		///a.autoparking();  sibling cannot inherit
		
	}

}
