package basic;

import java.util.Scanner;

public class Switch_Paractice {

	public static void main(String[] args) {
		int num;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number");
		num=input.nextInt();
		switch(num) {
		
		case 1:{
			System.out.println("This is Case One");
			break;
		}
		case 2:
		{
			System.out.println("This is two");
			break;
		}
		default:
			System.out.println("Invalid Input");
		
		
		}

	}

}
