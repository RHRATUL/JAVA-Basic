package basic;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
	 int age=18;
	 double Inputage;
	 
	 Scanner input= new Scanner(System.in);
	 System.out.println("Enter Your Age");
	 Inputage=input.nextDouble();
	 if(age<Inputage)
	 {
		 System.out.println("You are Adult");
	 }
	 else {
		 System.out.println("You Are Not Adult");
	 }

	}

}
