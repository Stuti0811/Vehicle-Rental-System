import java.util.Scanner;
public class RentalSystem {
    static Scanner sc = new Scanner(System.in);
    	
    	public static void main(String[] args) {
			Vehicle[] vehicles= {
					new Car(1,"Toyota",5000,5,"Petrol"),
					new Car(2, "Kia", 5500, 5, "Diesel"),
					new Car(3, "Cretta", 6500, 5, "diesel"),
					new Car(4, "XUV 700", 8000, 7, "Diesel"),
					new Motorcycle(5, "Honda CB500X", 600, 471),
		            new Motorcycle(6, "Yamaha MT 15", 950, 80),
					new Motorcycle(7, "Honda Activa 6G", 300, 120),
		            new Bicycle(8, "Giant Escape", 10.0, "Shimano"),
		            new Bicycle(9, "GAMER APEX 26T IBC", 0, "Shimano"),
		            new Bicycle(10, "WAKA WAKA 26T", 700, "Shimano")
			};
			displayAvailableVehicles(vehicles);
			rentVehicles(vehicles);
			confirmVehicle();
			modeOfPayment();
		}
    	
    	public static void displayAvailableVehicles(Vehicle[] vehicles) {
    		System.out.println("Available Vehicles: ");
    		for(int i=0;i<vehicles.length;i++) {
    			vehicles[i].displayDetails();
    		}
    	}
    	static double tot_cost;
    	public static void rentVehicles(Vehicle[] vehicles) {
    		System.out.println();
    		System.out.println("Enter vehicle ID to rent: ");
    		int vehicleID=sc.nextInt();
    		
    		Vehicle selectedVehicle=null;
    		for(int i=0;i<vehicles.length;i++) {
    			if(vehicles[i].getVehicleID()==vehicleID) {
    				selectedVehicle=vehicles[i];
    				break;
    			}
    		}
    		if(selectedVehicle!=null) {
    			System.out.println("Enter no. of days to rent:");
    			int rentalDuration = sc.nextInt();
    			
    			tot_cost=selectedVehicle.getRentalRatePerDay()*rentalDuration;
    			 System.out.println("Rental Details:");
               selectedVehicle.displayDetails();
               System.out.println("Rental Duration: " + rentalDuration + " days");
               System.out.println("Total Cost: " + tot_cost);
           } else {
               System.out.println("Invalid vehicle ID. Please try again.");
           }
    		
    	}
    	
    	public static void confirmVehicle() {
    		System.out.println();
    		System.out.println("Are to sure you want to proceed? YES or NO");
    		String ans=sc.next();
    		if(ans.equals("YES")) {
    			System.out.println("Enter your details: ");
    			System.out.println("Enter your name: ");
    			String name = sc.next();
    			System.out.println("Enter your Phone no.: ");
    			long num = sc.nextLong();
    			
    			System.out.println();
    			System.out.println("Generated Bill: ");
        		System.out.println("Name: "+name);
        		System.out.println("Phone no.: "+num);
        		System.out.println("Total Cost: "+tot_cost);
    		}else {
    			System.out.println("Okay! Thanks for visiting!");
    			 System.exit(0);
    		}
    	}


		
    	public static void modeOfPayment() {
    		System.out.println();
    		System.out.println("Select mode of Payment: ");
    		System.out.println("1 for Cash");
    		System.out.println("2 for GPay/Paytm/PhonePay");
    		
    		int m=sc.nextInt();
    		switch(m) {
    		case 1:
    			System.out.println("Payment will be done using cash");
    			break;
    		
    		case 2:
    			System.out.println("Pay on this UPI id: xyzvehicles@okhdfcbank");
    			break;
    			
    		}
    		System.out.println();
    		System.out.println("Payment done: YES or NO");
    		String p = sc.next();
    		if(p.equals("YES")) {
    			System.out.println("Payment Completed");
    			System.out.println("Thanks You for Visiting!");
    		}else {
    			System.out.println("Try again!");
    		}
    	}
    	
}
