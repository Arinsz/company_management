package se.distansakademin.employees;

public class Developer extends Employee implements ICanProgram {
	
	private  String programmingLanguage;
	

	public Developer(String name, String programmingLanguage) {
		
		super(name);
		this.programmingLanguage = programmingLanguage;
	}
	
	@Override
	public String getSound(){
		return "Woop Woop!";
	}
	
	public String getProgrammingLanguage() {
		
		return programmingLanguage;
	}
	
	
	@Override
	public String program() {
		
		return name + " writes some " + programmingLanguage;
	}
}
