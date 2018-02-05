package hospital;

public class Doctor extends Employee {
	private String specialty; 

	public void drawBlood(Bleedable patient) {
		patient.removeBlood(1);
	}

	public int getSalary() {
		return 90000;

	}

	public String getSpecialty() {
		return "heart";
	}
}
