package OOPSInterface;

public class FortisHospital extends Medical implements USMedical , UKMedical , IndiaMedical{

	@Override
	public void physioServices() {
		System.out.println("US --- Physio Services");
	}

	@Override
	public void cardioServices() {
		System.out.println("US --- Cardio Services");
	}

	@Override
	public void entServices() {
		System.out.println("US --- ENT Services");
	}

	@Override
	public void oncologyServices() {
		System.out.println("UK --- Oncology Services");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("UK --- Pedia Services");
		
	}

	@Override
	public void nueroServices() {
		System.out.println("India --- Neuro Services");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("India --- Dental Services");
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH -- Emergency Services");
	}

	public void opdServices()
	{
		System.out.println("FH -- OPD Services");
	}
	
	public void medicalInsuranceServices()
	{
		System.out.println("FH -- Medical Insurance Services");
	}
	
	public static void billing()
	{
		System.out.println("FH -- Medical Billing");
	}

	

	@Override
	public void covid19Testing() {
		System.out.println("Covid Vaccine");
	}

	@Override
	public void covid19research() {
		System.out.println("Covid Research");
		
	}
	@Override
	public int getPatientNumber(String name) {
		
		if(name.equals("Pooja"))
			return 100;
		else
			return 800;
	}
//	
//	@Override
//	public void medicalTraining()
//	{
//		System.out.println("FH --- Medical Training");
//	}
}
