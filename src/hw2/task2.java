package hw2;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1");
		float a = scan.nextInt();
		System.out.println("Enter number 2");
		float b = scan.nextInt();
		System.out.println("Enter number 3");
		float c = scan.nextInt();

		if (a > -5 && a < 5 && b > -5 && b < 5 && c > -5 && c < 5) {
			System.out.println("All numbers are correct");
		} else {
			System.out.println("All numbers are NOT correct");

		}

	}

}
