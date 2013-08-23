
public class Patient {
		//declaring variables and their data types
		private int patientIdNumber;
		private int patientAge;
		private BloodType patientBloodData;
	
	//constructors
	public Patient(int id, int age, BloodType bloodData) {
		patientIdNumber = id;
		patientAge = age;
		patientBloodData = bloodData;
	}
	//default constructor
	public Patient() {
		this(0,0, new BloodType());
	}
	
	//accessors
	public int getPatientId() {
		return patientIdNumber;
	}
	
	public int getPatientAge() {
		return patientAge; 
	}
	

	public String getBloodType(){
		return patientBloodData.getBloodType() + patientBloodData.getRhFactor();
	}
	
	//mutator methods
	public void setPatientIdNumber(int newId) {
		patientIdNumber = newId;
	}
	
	public void setPatientAge(int newAge) {
		patientAge = newAge;
	}
	
	public void setBloodType(BloodType newBloodType) {
		patientBloodData = newBloodType;
	}
	
	
	
	
}	
	
	
	
