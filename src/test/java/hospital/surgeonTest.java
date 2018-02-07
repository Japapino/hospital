package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class surgeonTest {
	Doctor underTest = new Surgeon("","",false); 
	
	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Surgeon("","",false);

		int salary = underTest.getSalary();

		assertThat(salary, is(100000));
	}
	
	@Test
	public void shouldDrawBlood() {
		Patient patient = new Patient();
		
		int bloodsBefore = patient.getBloods(); 
		underTest.drawBlood(patient); 
		
		int bloodsAfter = patient.getBloods();
		assertThat(bloodsBefore - bloodsAfter, is(1));
	}
	
	@Test
	public void shouldIncreasePatientHealth() {

		Patient patient = new Patient(); 
		
		int healthBefore = patient.getHealth();
		underTest.administerCare(patient); 
		int healthAfter = patient.getHealth(); 
		assertThat(healthAfter-healthBefore,is(10));
	}
	
	@Test
	public void shouldGoIntoSurgery() {
		Patient patient = new Patient();
		int bloodsBefore = patient.getBloods(); 
		int healthBefore = patient.getHealth(); 
		
	}

}
