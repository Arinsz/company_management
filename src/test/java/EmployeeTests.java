import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import se.distansakademin.employees.Employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTests {
	
	
	
	Employee employee;
	
	@BeforeEach
	public void init(){
		employee = new Employee("linus");
	}
	
	@Test
	public void testConstructorSetName(){
		var expected = "Linus";
		var actual = employee.getName();
		
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Linus", "John", "Alice"})
	public void testConstructorSetName(String expected) {
	employee.setName(expected);
	var actual = employee.getName();
	
	assertEquals(actual, expected);
	
	}
	
	@Test
	public void testGetSound(){
		var expected = "Aaow!";
		var actual = employee.getSound();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testEatFood() {
		var expected = "Nom nom nom!";
		var actual = employee.eatFood();
		
		assertEquals(expected, actual);
	}
}
