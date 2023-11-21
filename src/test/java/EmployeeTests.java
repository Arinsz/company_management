import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.distansakademin.Employee;

public class EmployeeTests {
	
	
	@Test
	public void testGetSound(){
	
		var employee = new Employee("linus");
		
		var expected = "Aaow!";
		var actual = employee.getSound();
		
		Assertions.assertEquals(expected, actual);
	
	}
	
	@Test
	public void testConstructorSetName(){
	
		var employee = new  Employee("linus");
		employee.setName("linus");
		
		var expected = "Linus";
		var actual = employee.getName();
		
		Assertions.assertEquals(expected, actual);
	
	}
	
	
	@Test
	void testEatFood() {
		
		var employee = new  Employee("linus");
	
		
		var expected = "Nom nom nom!";
		var actual = employee.eatFood();
		
		Assertions.assertEquals(expected, actual);
		
		
	}
}
