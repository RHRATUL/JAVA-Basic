package basic;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int number;
		Scanner input=new Scanner(System.in);
		System.out.println("Please Enter A Positive Number");
		number=input.nextInt();
		if(number%2==0)
		{
			System.out.println("This is Even Number");
		}
		else {
			System.out.println("This is OOD number");
			
		}
	}

}
