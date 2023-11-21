package se.distansakademin;

public class Website{
	
	private boolean isWorking;
	
	
	
	
	public Website(Boolean isWorking) {
		
		this.isWorking = isWorking;
	}
	
	public boolean isWorking() {
		
		return isWorking;
	}
	
	public void fix(){
		isWorking = true;
	}
	
}
