/* This .class serves as the Parking Meter. The ParkingMeter constructor is called in the demo
   to determine how much time is purchased for parking. The getter method for this is called
   in PoliceOfficer.class to calculate the ticket price. */
   
public class ParkingMeter{
 
	private static int minPurchased;
 
	public ParkingMeter(int carMinPurchased) //constructor for amount of minutes purchased
   {
		minPurchased = carMinPurchased;
	}
   
   ParkingMeter(ParkingMeter pm)            //copy constructor
   {
      minPurchased = pm.minPurchased;
   }
 
	public static int getMinPurchased()      //getter method for minutes purchased
   {
		return minPurchased;
	}
}