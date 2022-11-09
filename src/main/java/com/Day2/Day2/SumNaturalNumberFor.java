package com.Day2.Day2;

import java.util.Scanner;

public class SumNaturalNumberFor {

	public static void main(String[] args) {
		int n, sum = 0;
        System.out.println("Enter a Natural Number: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for (int i=1; i<=n; i++) {
            sum = sum + i;
        }
        System.out.println("The result is: " +sum);
        scan.close();
	}

}
