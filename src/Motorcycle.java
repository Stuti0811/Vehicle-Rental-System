
public class Motorcycle extends Vehicle{
	
    private int topSpeed;
	
	
	public Motorcycle(int vehicleID, String model, double rentalRatePerDay, int topSpeed) {
		super(vehicleID, model, rentalRatePerDay);
		this.topSpeed = topSpeed;
	}

	// Getters and setters
    
    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
	
	void displayDetails() {
		super.displayDetails();
		System.out.println(topSpeed);
	}
}
