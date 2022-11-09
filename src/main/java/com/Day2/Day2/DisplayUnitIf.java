package com.Day2.Day2;

import java.util.Scanner;

public class DisplayUnitIf {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the Number: ");
	        int a = scan.nextInt();

	        if (a < 10) {
	            System.out.println("Entered number's unit is ones");
	        } else if (a < 100) {
	            System.out.println("Entered number's unit is tens");
	        } else if (a < 1000) {
	            System.out.println("Entered number's unit is hundred");
	        } else if (a < 10000) {
	            System.out.println("Entered number's unit is thousands");
	        } else {
	            System.out.println("Sorry try again.");
	        }
	        scan.close();
	}

}
