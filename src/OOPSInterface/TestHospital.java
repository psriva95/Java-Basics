package OOPSInterface;

public class TestHospital {

	public static void main(String[] args) {
	
		FortisHospital fortisHospital = new FortisHospital();
		fortisHospital.entServices();
		fortisHospital.nueroServices();
		fortisHospital.emergencyServices();
		fortisHospital.cardioServices();
		
		System.out.println(USMedical.min_fee);

		FortisHospital.billing();
		USMedical.billing();
		
		System.out.println(fortisHospital.getPatientNumber("Pooja"));
		
		System.out.println("________");
		fortisHospital.medicalEquipment();
		fortisHospital.medicalStudy();
		
	//	USMedical.min_fee = 100;
		
		fortisHospital.medicalTraining();
		
		USMedical us = new FortisHospital();
		us.physioServices();
		us.cardioServices();
		us.entServices();
		us.emergencyServices();
		
		System.out.println(us.min_fee);
	
		us.medicalTraining();
	}

}
