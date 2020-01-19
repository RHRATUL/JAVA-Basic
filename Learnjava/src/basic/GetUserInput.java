package basic;

import java.util.Scanner;

public class GetUserInput {

	public static void main(String args[]) {
		int id;
		//char section;
		String name;
		double Fees;
		float GPA;

		Scanner input = new Scanner(System.in);
		
		System.out.println("EnterYour ID number=");
		id = input.nextInt();
		System.out.println("Id Number is=" + id);
         System.out.println();
         
         
        System.out.println("Enter Your  Name");
 		name = input.next();
 		System.out.println("The name is="+ name);
		System.out.println();
		
		System.out.println("Enter Your Fess Amount");
		Fees = input.nextDouble();
		System.out.println("Total fees is=" + Fees);
		System.out.println();
		System.out.println("Enter Your GPA");
		GPA = input.nextFloat();
		System.out.println("GPA is " + GPA);

	}

}
