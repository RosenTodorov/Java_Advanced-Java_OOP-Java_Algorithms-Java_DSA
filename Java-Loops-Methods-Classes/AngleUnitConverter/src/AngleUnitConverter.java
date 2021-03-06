import java.util.Scanner;

public class AngleUnitConverter {
	/**
	   Write a method to convert from degrees to radians. Write a method 
			to convert from radians to degrees. You are given a number n and n 
			queries for conversion. Each conversion query will consist of 
			a number + space + measure. Measures are "deg" and "rad". Convert 
			all radians to degrees and all degrees to radians. Print the results 
			as n lines, each holding a number + space + measure. Format all numbers 
			with 6 digit after the decimal point.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double[] number = new double[n];
		String[] measures = new String[n];
		
		for (int i = 0; i < n; i++) {
			number[i] = input.nextDouble();
			measures[i] = input.next();
		}
		
		for (int i = 0; i < n; i++) {
		    convert(number[i], measures[i]);
		}
	}
	
	public static void convert(double value, String type){
		if (type.equals("rad")){
			double result = Math.toDegrees(value);
			System.out.printf("%.6f deg\n", result);
		}		
		else {
			double result = Math.toRadians(value);
			Math.toDegrees(value);
			System.out.printf("%.6f rad\n", result);
		}
	}
}
