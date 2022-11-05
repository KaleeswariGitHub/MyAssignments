package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 12345678;
	boolean isPuncture = false;
	String bikeName = "hero Honda";
	double runningKM = 3245678.2345;
				

	public static void main(String[] args) {
	
		TwoWheeler smallBike = new TwoWheeler();
		
		System.out.println("Number of Wheels:" + smallBike.noOfWheels);
		System.out.println("Number of Mirrors:" + smallBike.noOfMirrors);
		System.out.println("Chassis Number:" + smallBike.chassisNumber);
		System.out.println("Is Puncture?" + smallBike.isPuncture);
		System.out.println("Bike Name:" + smallBike.bikeName);
		System.out.println("No. of Kilometers:" + smallBike.runningKM);

	}

}
