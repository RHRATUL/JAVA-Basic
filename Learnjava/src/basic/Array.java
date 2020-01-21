package basic;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int num[]= new int[5];
		int i;
		int sum=0;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Number");
		for(i=0;i<5;i++)
		{
			num[i]=input.nextInt();
		}
		   for(i=0;i<5;i++) {
			    sum=sum+num[i];
		   }
		   System.out.println("The Sum is :"+sum);

	}

}
