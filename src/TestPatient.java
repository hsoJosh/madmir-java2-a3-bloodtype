
public class TestPatient {
	public static void main(String[] args) {
		
		BloodType joshsBloodType = new BloodType("AB", '-'); //setting my bloodtype then loading joshsBloodType into my overloaded construct
		
		Patient josh = new Patient(9384, 23, joshsBloodType); //testing overloaded construct
		Patient carol = new Patient();
		Patient clyde = new Patient();

		//testing mutators
		carol.setPatientAge(27);
		BloodType carolsBloodType = new BloodType("AB",'+');
		carol.setBloodType(carolsBloodType);
		carol.setPatientIdNumber(4589);
		
		
		
		
		
				//Outputs
		System.out.println("Josh's ID number is " + josh.getPatientId() + ". His age is " + josh.getPatientAge() + ". His blood type is " 
				+ josh.getBloodType());
	
		System.out.println("carol's ID number is " + carol.getPatientId() + ". Her age is " + carol.getPatientAge() + ". Her blood type is " 
				+ carol.getBloodType());
		
		System.out.println("clyde's ID number is " + clyde.getPatientId() + ". His age is " + clyde.getPatientAge() + ". His blood type is " 
						+ clyde.getBloodType());
	}

}
