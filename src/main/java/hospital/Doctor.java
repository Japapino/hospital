package hospital;

public class Doctor extends Employee implements MedicalDuties {
	private String specialty; 


	public Doctor(String empNumber, String name) {
		this.empName = name;
		this.empNumber = empNumber;
	}
	
	@Override
	public void drawBlood(Bleedable patient) {
		patient.removeBlood(1);
	}
	
	@Override
	public int getSalary() {
		return 90000;
	}
	
	@Override
	public void administerCare(Patient patient) {
		patient.giveHealth(10); 
	}

	public String getSpecialty() {
		return "heart";
	}
	

}
