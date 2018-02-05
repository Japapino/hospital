package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {
	
	
	@Test
	public void shouldDrawBlood() {
		Nurse underTest = new Nurse();
		Patient patient = new Patient();
		
		int bloodsBefore = patient.getBloods(); 
		underTest.drawBlood(patient); 
		
		int bloodsAfter = patient.getBloods();
		assertThat(bloodsBefore - bloodsAfter, is(1));
	}
	
	boolean wasBled = false;
	
	public class BleedableDouble implements Bleedable {
		@Override
		public void removeBlood(int amount) {
			wasBled = true;
		}
	}
	
	@Test
	public void shouldDrawBloodFromTestDouble() {
		Nurse underTest = new Nurse(); 
		Bleedable patient = new BleedableDouble(); 
		
		underTest.drawBlood(patient);
		
		assertThat(wasBled, is(true)); 
		
	}
	
	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Nurse(); 
		int salary = underTest.getSalary(); 
		assertThat(salary, is(50000)); 
		
	}

}
