/* This .class serves as the Parked Car. The constructor is called in the demo
to recieve information such as the make/model/color/license of the car, and how
long the car has been parked. The getter methods are called and assigned to
a string by ParkingTicket.class. The getMinutes() method is called by
PoliceOfficer.class to determine ticket price.*/
public class ParkedCar { 

   private static String make;      //private data fiels
	private static String model;
	private static String color;
	private static String license;
	private static int minutes;
 
	public ParkedCar(String carMake, String carModel, String carColor, String carLicense, int carMinutes) 
   {
		make = carMake;                        //constructor for the info of the car
		model = carModel;
		color = carColor;
		license = carLicense;
		minutes = carMinutes;
	}
   
   ParkedCar(ParkedCar pc)                   //copy constructor
   {
		model = pc.model;
		color = pc.color;
		license = pc.license;
		minutes = pc.minutes;
   }
 
	public static String getMake()         //getter methods
   {
		return make;
	}
	public static String getModel() 
   {
		return model;
	}
	public static String getColor() 
   {
		return color;
	}
	public static String getLicense() 
   {
		return license;
	}
	public static int getMinutes() 
   {
		return minutes;
	}
}