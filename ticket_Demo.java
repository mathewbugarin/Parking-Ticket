/* This program serves as a demo for ParkedCar, ParkingMeter, PoliceOfficer, and ParkingTicket .class
   This program assigns values/strings to the contructors of each .class. With those values, a series
   of methods and operations will take place in each .class and return output to ParkingTicket.class
   Then methods from ParkingTicket.class will be called to print out the parking ticket depending if
   the car exceeds 60 minutes. */
   
public class ticket_Demo {
 
	public static void main(String[] args) 
   {
 
		ParkedCar car = new ParkedCar("Honda", "Civic SI", "Blue", "5TPB559", 100);   //object values are assigned to ParkedCar constructor
		ParkingMeter meter = new ParkingMeter(60);                                    //object value is assigned to ParkingMeter constructor
		PoliceOfficer mat = new PoliceOfficer("John Doe", 8281);                   //object value is assigned to PoliceOffice constructor
      ParkingTicket tickIt = new ParkingTicket();                                   //object created for ParkingTicket()
      
		double ticket = mat.search(car, meter);                                       //ticket var. is assigned to PoliceOfficer.search method

		if (ticket != 0.0)                                                            //if loop to determine if a ticket was given
      {
			System.out.println("Ticket Price: $" + ticket);                            //if ticket was given, car details, ticket price, and
         System.out.println(tickIt.printTicket());                                  //officer name/badge is printed by calling ParkingTicket
         System.out.println("~~~~~~~~");                                            //methods
         System.out.println(tickIt.printName());
		}
		else                                                                          //if ticket was not given, prints this
      {
			System.out.println("Vehicle's time has not yet expired.");
		}
	} 
}