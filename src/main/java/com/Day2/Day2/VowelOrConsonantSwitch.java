package com.Day2.Day2;

import java.util.Scanner;

public class VowelOrConsonantSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char c = scan.next().charAt(0);

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(c + " is a vowel.");
                break;
            default:
                System.out.println(c + " is a consonant.");
                scan.close();
        }

	}

}
