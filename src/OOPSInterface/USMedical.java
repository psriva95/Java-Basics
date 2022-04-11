package OOPSInterface;

public interface USMedical extends WHO {

	
	int min_fee = 500;    //static and final in nature by default
	public void physioServices();
	public void cardioServices();
	public void entServices();
	public void emergencyServices();
	
	
	public int getPatientNumber(String name);
	
	//after 1.8 jdk
	public static void billing()
	{
		System.out.println("US -- Medical Billing");
	}
	
	default void medicalTraining()
	{
		System.out.println("US --- Medical Training");
	}
}
