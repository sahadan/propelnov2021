package com.faith.app;

import java.util.Scanner;

/*
 * Finding AREA and CIRCUMFERENCE OF a Circle
 * 
 */
public class SolutionArea {

	public static void main(String[] args) {

		// Declaring variables
		double radius, circumference;

		/*
		Scanner input = new Scanner(System.in);
		// final double PI = 3.14159265;

		// double pie = Math.PI;
		// radius=5;
		System.out.print("Enter radius : ");
		double inputRadius = input.nextDouble();

		// 5.5
		// radius = 5.5

		// Escape sequence
		// calculateArea(5.5)
		System.out.println("Next Area is " + calculateArea(radius)); // Method
		// String.format("%.2f",calculateArea(radius));.

		System.out.println("Circumfere nce is : "
				+ calculateCircumference(radius));
		
		System.out.println(String.format("Area is %.2f", calculateArea(inputRadius)));
		*/
		
	      Scanner input= new Scanner(System.in);
	      System.out.print("Enter radius : ");
	      double inputRadius=input.nextDouble();
	      
	      //System.out.println(area(inputRadius));
	      //System.out.println(circumference(inputRadius));
	      
	      //System.out.println(String.format("Area is %.2f", calculateArea(inputRadius)));
	  
	      //System.out.println(String.format("Circumference is %.4f", calculateCircumference(inputRadius)));
		

		// System.out.printf();
	}

	// Method // double radius=5.5
	private static double calculateArea(double radius) { // parameter radius

		// 5.5 * 5.5 * 3.14
		return radius * radius * Math.PI;

	}

	// Calculating Circumerence
	private static double calculateCircumference(double radius) {
		return 2 * radius * Math.PI;
	}

}
