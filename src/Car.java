
public class Car extends Vehicle{
	 private int numSeats;
	 private String fuelType;
	public Car(int vehicleID, String model, double rentalRatePerDay, int numSeats, String fuelType) {
		super(vehicleID, model, rentalRatePerDay);
		this.numSeats = numSeats;
		this.fuelType = fuelType;
	}
	
	 public int getNumSeats() {
	        return numSeats;
	    }

	    public void setNumSeats(int numSeats) {
	        this.numSeats = numSeats;
	    }

	    public String getFuelType() {
	        return fuelType;
	    }

	    public void setFuelType(String fuelType) {
	        this.fuelType = fuelType;
	    }

	
	void displayDetails() {
		super.displayDetails();
		System.out.println(numSeats+" "+fuelType);
	}
}
