import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import se.distansakademin.employees.CloudDeveloper;
import se.distansakademin.Website;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CloudDeveloperTests {

	CloudDeveloper cloudDeveloper;
	
	@BeforeEach
	public void init(){
	
		cloudDeveloper = new CloudDeveloper("linus", "java");
	
	}
	
	@ParameterizedTest
	@CsvSource({"true", "false"})
	public void testFixWebsiteParameterized(boolean isWorking){
		var website = new Website(isWorking);
		website.fix();
		
		var expected = true;
		
		var actual = website.isWorking();
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testFixWebsite(){
		var website = new Website(false); // false means website is not working
		cloudDeveloper.fixWebsite(website);
		
		var expected = true;
		var actual = website.isWorking();
		
		assertEquals(expected, actual);
	}
	
	
}
