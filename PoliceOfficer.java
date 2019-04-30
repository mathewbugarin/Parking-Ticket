/* This .class file serves as the Police Officer. The PoliceOfficer constructor is called in the demo
   where it is assigned a string and int. This .class also gets data from ParkedCar.class and ParkingMeter.class
   to determine the cost of the ticket and time overused. The ticket price and time method is called assigned to
   a string in the ParkingTicket.class */
   
public class PoliceOfficer {
 
	private static String name;            //private static data fields initialized
	private static int badge;
	private static double ticket;
   private static int time;
   
	public PoliceOfficer(String copName, int copBadge) //constructor for Police name and badge number
   {
		name = copName;
		badge = copBadge;
	}
   
   PoliceOfficer(PoliceOfficer po)                    //copy constructor
   {
      name = po.name;
      badge = po.badge;
   }
 
	public static String getName()         //getter method for police name
   {
		return name;
	}
	public static int getBadge()           //getter method for police badge number
   {
		return badge;
	}
   
	static double search(ParkedCar car, ParkingMeter meter)        //calc method to determine and return ticket price
   {
 
		int  time = ParkedCar.getMinutes() - ParkingMeter.getMinPurchased();
 
		if(ParkedCar.getMinutes() > ParkingMeter.getMinPurchased()) 
      {
			if(time <= 60)                                           //ticket is set to 25 if time overdue is less than 60
         {
				ticket = 25;
			}
		else
         {                                                        //ticket is increased based on time overdue over 60
			   ticket = 25 + (10 * (time/60));
		   }
		}
		return ticket;
   }
   
   public static int getTime()                                    //calc method to determine and return time overused
   {
   int  time = ParkedCar.getMinutes() - ParkingMeter.getMinPurchased();
   return time;
   }
}