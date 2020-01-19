package basic;

import java.util.Scanner;

public class AreaOfTringle {

	public static void main(String[] args) {
		double d = 0.5;
		int b;
		int h;
		double area;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Base");
		b = input.nextInt();
		System.out.println("Enter Height");
		h = input.nextInt();
		area = d * b * h;
		System.out.println("The Result is " + area);

	}

}
