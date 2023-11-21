import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.distansakademin.CloudDeveloper;
import se.distansakademin.Website;


public class CloudDeveloperTests {

	
	@Test
	public void testFixWebsite() {
		
		var cloudDeveloper = new CloudDeveloper("Arin", "Java");
		Website website = new Website(false);
		
		
		
		cloudDeveloper.fixWebsite(website);
		
		var expected = true;
		var actual = website.isWorking();
		
		Assertions.assertEquals(expected, actual);
		
	}
	
	
	
}
