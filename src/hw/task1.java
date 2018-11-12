package hw;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = scan.nextInt();
		System.out.println("Enter number 2");
		int b = scan.nextInt();
		System.out.println("Enter number 3");
		int c = scan.nextInt();

		int max = a;
		if (max < b) {
			max = b;
		} else if (max < c) {
			max = c;
		}
		System.out.println("max = " + max);

		int min = a;
		if (min > b) {
			min = b;
		} else if (min > c) {
			min = c;
		}
		System.out.println("min = " + min);

	}

}
