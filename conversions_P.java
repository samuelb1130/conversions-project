package conversions_P;

import java.util.Scanner;

public class conversions_P {

	public static void main(String[] args) {

		Scanner bread = new Scanner(System.in);
		

	}

	public static double inches (double feet)
	{	
		double inches = feet * 12;
		return inches;
	
	}
	
	public static double feet (double miles)
	{	
		double feet = miles * 5280;
		return feet;
	
	}
	
	public static double meters (double yards)
	{	
		double meters = yards/1.094;
		return meters;
	
	}
	
}
