package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class janitorTest {
	
	@Test
	public void shouldHaveSalary() {
		Janitor underTest = new Janitor("",""); 
		int check = underTest.getSalary(); 
		assertEquals(check,40000); 
	}
	
	@Test
	public void shouldDrawBlood() {
		Janitor underTest = new Janitor("",""); 
		Patient patient = new Patient();
		int bloodsBefore = patient.getBloods();
		underTest.drawBlood(patient); 
		int bloodsAfter = patient.getBloods(); 
		assertThat(bloodsBefore-bloodsAfter,is(2)); 
	}
	
	@Test
	public void shouldReducePatientHealth() {
		Janitor underTest = new Janitor("",""); 
		Patient patient = new Patient(); 
		int healthBefore = patient.getHealth();
		underTest.administerCare(patient);
		int healthAfter = patient.getHealth(); 
		assertThat(healthBefore-healthAfter, is (2)); 
	}

}
