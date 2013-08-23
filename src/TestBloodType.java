
public class TestBloodType {

	public static void main(String[] args) {
			//testing accessors

		BloodType josh = new BloodType("B", '-');
		BloodType carol = new BloodType();
		BloodType carn = new BloodType('-');
		BloodType clyde = new BloodType("AB");
		
		System.out.println("Joshs blood type is " + josh.getBloodType() + josh.getRhFactor());
		System.out.println("carols blood type is " + carol.getBloodType() + carol.getRhFactor());
		System.out.println("Carns new rhFactor is " + carn.getBloodType() + carn.getRhFactor());
		System.out.println("Clydes new bloodType is " + clyde.getBloodType() + clyde.getRhFactor());
		
		
			//testing mutators
		josh.setBloodType("AB");
		josh.setRhFactor('+');
		
		System.out.println("Joshs new blood type is " + josh.getBloodType() + josh.getRhFactor());

		
	}

}
