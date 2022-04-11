package OOPsInheritenceCollege;

public class School implements IndianEducationSystem , UKEducationSystem, USEducationSystem{

		
		@Override
		public void SecondaryHighSchoolSubjects() {
			System.out.println("India --- Secondary High School Subjects Lists");
			
		}
		
		@Override
		public void HighSchoolSubjects() {
			System.out.println("India ----- High School Subjects Lists");
			
		}
		
		@Override
		public void EducationBoard() {
			System.out.println("India ------ Education Board");
			
		}

		@Override
		public void holisticGrowthStrategies() {
			System.out.println("US ------ Holistic Growth");
			
		}

		@Override
		public void disciplines() {
			System.out.println("US ------ Disciplines");
			
		}

		@Override
		public void elementarySchoolPrograms() {
			System.out.println("US ------ elementarySchoolPrograms");
			
		}

		@Override
		public void middleSchoolPrograms() {
			System.out.println("US ------ middleSchoolPrograms");
			
		}

		@Override
		public void highSchoolPrograms() {
			System.out.println("US ------ highSchoolPrograms");
			
		}

		@Override
		public void primarySchool() {
			System.out.println("UK ------ primarySchool");
			
		}

		@Override
		public void secondarySchool() {
			System.out.println("UK ------ secondarySchool");
			
		}

		@Override
		public void extraCurricularProgrammes() {
			System.out.println("UK ------ extraCurricularProgrammes");
			
		}

		@Override
		public void diplomaCourses() {
			System.out.println("UK ------ diplomaCourses");
			
		}
	
	
}
