package se.distansakademin;

public class Employee extends Person {
	
	

	
	public Employee(String name) {
		
		this.name = name;
	}
	
	public String getSound(){
		return "Aaow!";
	}
	
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = capitalizeFirstLetter(name);
	}
	
	protected String capitalizeFirstLetter(String input){
		String firstCharacter = input.substring(0 , 1).toUpperCase();
		String rest =  input.substring(1);
		
		return firstCharacter + rest;
	}
	
	@Override
	public String eatFood() {
		
		return "Nom nom nom!";
		
	}
}
