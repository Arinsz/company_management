import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.distansakademin.Developer;
import se.distansakademin.Employee;

public class DeveloperTests {
	
	@Test
	public void testGetSound(){
		
		var developer = new Developer("linus", "java");
		
		var expected = "Woop Woop!";
		var actual = developer.getSound();
		
		Assertions.assertEquals(expected, actual);
		
	}
	
	@Test
	public void testGetProgrammingLanguage(){
		
		var developer = new Developer("linus", "java");
		
		var expected = "java";
		var actual = developer.getProgrammingLanguage();
		
		Assertions.assertEquals(expected, actual);
		
	}
	
	
}
