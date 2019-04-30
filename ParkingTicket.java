/* This .class file is to simulate the printing of a ticket. Methods in this .class file
are solely to return string types that show car make, model, license, color, and police
name/badge. These methods are called in the demo to print out a ticket. */

public class ParkingTicket 
  {
   public ParkingTicket()
   {
   
   }
   
	public String printTicket()                                    //ticket print method, uses getter methods from ParkedCar
   {                                                              //PoliceOffice
		String string = "Reason: Parking Meter Violation"
            + "\n        Time overdue for " + PoliceOfficer.getTime() + " minutes"
            + "\nVehicle Make: " + ParkedCar.getMake()
				+ "\nModel: " + ParkedCar.getModel()
				+ "\nColor: " + ParkedCar.getColor()
				+ "\nLicense Plate: " + ParkedCar.getLicense();
	   return string;
   }
   
   public String printName()                                      //name and badge print method, uses getter methods from PoliceOfficer
   {
      String nameBadge = "Officer On-Duty: " + PoliceOfficer.getName()
                         + "\nBadge Number: " + PoliceOfficer.getBadge();  
      return nameBadge;
   }
  }	