package com.Day2.Day2;

import java.util.Scanner;

public class ReverseIntegerNumberFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = scan.nextInt();
        int remainder = 0;
        int reverse = 0;

        for (;a != 0;) {
            remainder = a % 10;
            reverse = reverse * 10 + remainder;
            a = a / 10;
        }
        System.out.println(reverse);
	}
}

