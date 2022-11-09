package com.Day2.Day2;

import java.util.Scanner;

public class SumNaturalNumberWhile {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the Natural Number: ");
	        int a = scan.nextInt();
	        int sum = 0;
	        int i = 1;

	        while (i <= a) {
	            sum = sum + i;
	            i++;
	        }
	        System.out.println("The result is: " +sum);
	        scan.close();
	}

}
