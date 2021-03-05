package com.faith;

import java.util.*;

public class DemoHello {
	public static void main(String[] args) {

		String customerName = "";
		String brand = "";
		double processorSpeedInGHz = 0.0; // or float
		double ramSizeInGB = 0; // or float
		int harddiskSizeInGB = 0; // or short
		int monitorInInch = 0; // or byte
		double price = 0.0;
		char servicePlan = 'A';
		boolean onSiteService = false;
		boolean extendedWarranty = false;

		// Declare Scanner
		Scanner objScanner = new Scanner(System.in);
		System.out.print("Enter Customer Name : ");
		customerName = objScanner.nextLine();
		System.out.print("Enter Brand Name : ");
		brand = objScanner.next();

		System.out.print("Processor Speed : ");
		processorSpeedInGHz = objScanner.nextDouble();

		System.out.print("RAN  :");
		ramSizeInGB = objScanner.nextDouble();

		System.out.print("Hardsisk  :");
		harddiskSizeInGB = objScanner.nextInt();

		System.out.print("Monitor  :");
		monitorInInch = objScanner.nextInt();

		System.out.print("Price  : ");
		price = objScanner.nextDouble();

		System.out.print("Service Plan : ");
		servicePlan = objScanner.next().charAt(0);

		System.out.print("Site Service : ");
		onSiteService = objScanner.nextBoolean();

		System.out.print("Warranty : ");
		extendedWarranty = objScanner.nextBoolean();

		objScanner.close();

		// Properties/Java Compiler,
		// click box to Enable project specific settings,
		// use Compiler compliance level 1.7.

		String result = String.format("%s is %d%n", "Faith Info Tech", 1990);
		System.out.printf("%s is %d%n", "Faith Info Tech", 1990);

		System.out.print(String.format(
				" Customer Name: %s needs a brand: %s%n", customerName, brand));

		System.out.println("Brand Name " + brand);
		System.out.println("Processor Speed " + processorSpeedInGHz);
		System.out.println("RAN  " + ramSizeInGB);
		System.out.println("Harddisk  " + harddiskSizeInGB);
		System.out.println("Monitor " + monitorInInch);
		System.out.println("Price " + price);
		System.out.println("Service Plan " + servicePlan);
		System.out.println("On SiteService " + onSiteService);
		System.out.println("Extended Warranty  " + extendedWarranty);

	}

}
