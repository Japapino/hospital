package hospital;

public abstract class Employee {
	protected String empName;
	protected String empNumber;
	
	
	public String salaryInfo() {
		return "This employee's salary is " + getSalary();
	}
	
	public String getEmpNumber() {
		return empNumber;
	}
	
	public String getName() {
		return empName;
	}
	

	public abstract int getSalary();
}
