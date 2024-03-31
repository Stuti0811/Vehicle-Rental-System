
public class Bicycle extends Vehicle{
	
    private String gearType;
	
	
	public Bicycle(int vehicleID, String model, double rentalRatePerDay, String gearType) {
		super(vehicleID, model, rentalRatePerDay);
		this.gearType = gearType;
	}

	// Getters and setters
   
    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

	
	void displayDetails() {
		super.displayDetails();
		System.out.println(gearType);
	}

}
