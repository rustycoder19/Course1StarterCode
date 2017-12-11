package demos;

/** 
 * A class to illustrate class design and use.
 * Used in module 2 of the UC San Diego MOOC Object Oriented Programming in Java
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * 
 *
 */
public class LocationTester {
	public static void main(String[] args)
	{
		SimpleLocation ucsd = new SimpleLocation(32.9, -117.2);
		SimpleLocation lima = new SimpleLocation(-12.0, -77.0);
		SimpleLocation miamiAirport = new SimpleLocation(25.7959, 80.2870);
		SimpleLocation atlantaAirport = new SimpleLocation(33.6407, 84.4277);



		//latitude = -12.04;
		System.out.println(ucsd.distance(lima));
		System.out.println("Miami Airport Coordinates: " + miamiAirport.latitude + ", " + miamiAirport.longitude);
		System.out.println("Atlanta Airport Coordinates: " + atlantaAirport.latitude + ", " + atlantaAirport.longitude);

	}

}
