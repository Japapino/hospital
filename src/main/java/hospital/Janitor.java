package hospital;

public class Janitor extends Employee implements MedicalDuties{

	public Janitor(String empNumber, String empName) {
		this.empNumber = empNumber;
		this.empName = empName; 
	}


	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return 40000;
	}


	@Override
	public void drawBlood(Bleedable patient) {
		patient.removeBlood(2);
		
	}


	@Override
	public void administerCare(Patient patient) {
		patient.giveHealth(-2);
	}

}
