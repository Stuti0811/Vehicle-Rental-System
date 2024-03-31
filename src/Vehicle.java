
public class Vehicle {
	protected int vehicleID;
    protected String model;
    protected double rentalRatePerDay;
    
    public Vehicle(int vehicleID, String model, double rentalRatePerDay) {
		this.vehicleID = vehicleID;
		this.model = model;
		this.rentalRatePerDay = rentalRatePerDay;
	}
    
 // Getters and setters
    public int getVehicleID() {
    	return vehicleID;
    }
    public void setVehicleID(int vehicleID) {
    	this.vehicleID=vehicleID;
    }
    public String getModel() {
    	return model;
    }
    public void setModel(String model) {
    	this.model=model;
    }
    public double getRentalRatePerDay() {
    	return rentalRatePerDay;
    }
    public void setRentalRatePerDay(double rentalRatePerDay) {
    	this.rentalRatePerDay=rentalRatePerDay;
    }
    
    void displayDetails() {
    	System.out.print(vehicleID+" "+model+" "+rentalRatePerDay+" ");
    }
    
    
}
