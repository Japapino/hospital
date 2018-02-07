package hospital;

public class Nurse extends Employee implements MedicalDuties{
	
	public Nurse(String empNumber, String empName) {
		this.empName = empName;
		this.empNumber = empNumber; 
	}
	
	@Override
	public int getSalary() {
		return 50000; 
	}
	
	public void drawBlood(Bleedable patient) {
		patient.removeBlood(1);
	}
	
	public void administerCare(Patient patient) {
		patient.giveHealth(5); 
	}


}
