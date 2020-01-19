package basic;

import java.util.Scanner;

public class Temperature_Converter {

	public static void main(String[] args) {
		 int c;
		 double d=9/5;
		 int e=32;
		 Scanner input =new Scanner(System.in);
		 System.out.println("Enter Celsius");
		 c=input.nextInt();
		 double result=c*d+e;
		 System.out.println("The Result Is "+result+" Ferenhight");

	}

}
